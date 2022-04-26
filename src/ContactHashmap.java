import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import util.Input;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.stream.Stream;

public class ContactHashmap {
    private static Path path = tryMakeFileDirectory();
    private static HashMap<String, Contact> contacts = tryRead(path);


    //------------------GET CONTACTS METHOD----------------------
    public static HashMap<String, Contact> getContacts() {
        if (contacts.isEmpty()) {
            Contact c1 = new Contact("Jenny", 77380, "867-5309");
            c1.addZip(77382);
            Contact c2 = new Contact("Jane", 77380, "936-999-0101");
            c2.addZip(77380);

            contacts.put(c1.getName(), c1);
            contacts.put(c2.getName(), c2);
        }
        return contacts;
    }
//---------------------------------------------------------------


    //-----------CONTACT SEARCH BY NAME METHOD------------
    public static HashMap<String, Contact> searchContacts() {
        Input userSelection = new Input();
        String userInput = userSelection.scanner.next();
        boolean flag = false;
        System.out.println();
        System.out.println("Search Results:");
        System.out.println("Name            |  Phone Number");
        System.out.println("--------------------------------");
        for (Contact person : contacts.values()) {
            if (person.getName().toLowerCase(Locale.ROOT).contains(userInput.toLowerCase(Locale.ROOT))) {

//                System.out.println(person.getName());
//                System.out.println(person.getPhone());
//                System.out.println("----------------");
                System.out.println("+---------------+----------------+");
                System.out.println( person.getName()+ "  | " + person.getPhone());
                System.out.println("+---------------+----------------+");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No contacts with that name found!");
        }
        System.out.println();
        System.out.println();
        return contacts;
    }
//---------------------------------------------------------------




    //using long--- for phone number to save on memory
    public static void addContactToBook(String name, long number) {

contacts.put(name, new Contact(name, 56285, Long.toString(number)));
    }

    public static void tryWriteFile(HashMap<String, Contact> contactMap){
        Path filePath = tryMakeFileDirectory();
        Type token = new TypeToken<HashMap<String, Contact>>() {}.getType();

        String mapString = new Gson().toJson(contactMap, token);
        try {
            Files.write(filePath, Stream.of(mapString).toList());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static HashMap<String, Contact> tryRead(Path filePath){
        Type token = new TypeToken<HashMap<String, Contact>>() {}.getType();
        try {

//            System.out.println(Files.readAllLines(filePath));
            HashMap<String, Contact> map =  new Gson().fromJson(Files.readAllLines(filePath).get(0), token);
//            System.out.println(map.getClass());
            return map;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static Path tryMakeFileDirectory(){
        String directory = "data";
        String filename = "info.json";

        // make the Path objects for the director and file
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        // because Files.createDirectories and Files.createFile can throw IOException,
        // we need to toss them into a try/catch block so it doesn't crash the program
        try{
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // oof - null check needed!
        return null;
    }


    public static void addContactUserInput() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nWhat is the name of the person you would like to save? " +
                "(Firstname Lastname");
        String name = in.nextLine();

        System.out.println("\nWhat is the phone number of the person you are " +
                "saving? (1112223456)");
        long phoneNumber = in.nextLong();
        in.nextLine();


        addContactToBook(name, phoneNumber);

    }

}











