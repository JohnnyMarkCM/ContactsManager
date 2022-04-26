import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import util.Input;
import java.util.Scanner;
import java.util.HashMap;

public class ContactHashmap {
    private static HashMap<String, Contact> contacts = new HashMap<>();


    //------------------GET CONTACTS METHOD----------------------
    public static HashMap<String, Contact> getContacts() {
        if (contacts.isEmpty()) {
            Contact c1 = new Contact("Jenny", 77380, "867-5309");
            c1.addZip(77382);
            Contact c2 = new Contact("Jane", 77380, "936-999-0101");
            c2.addZip(77380);

            contacts.put(c1.name, c1);
            contacts.put(c2.name, c2);
        }
        return contacts;
    }
//---------------------------------------------------------------


    //-----------CONTACT SEARCH BY NAME METHOD------------
    public static HashMap<String, Contact> searchContacts() {
        Input userSelection = new Input();
        String userInput = userSelection.scanner.next();
        boolean flag = false;


        for (Contact person : ContactHashmap.getContacts().values()) {
            while (userInput.equalsIgnoreCase(person.name)) {
                System.out.println(person.getName());
                System.out.println(person.getPhone());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("No contacts with that name found!");
        }
        return contacts;
    }
//---------------------------------------------------------------




    //using long--- for phone number to save on memory
    public static void addContactToBook(String name, long number) {


        System.out.println("Adding contact " + name + " : " + number);
        File file = new File("contactsBook.txt");
        //make sure to make if statement if it does/not exist

        try {

            if (!file.exists())
                file.createNewFile();
            // now write to file as this takes an argument which is what we are writing to
            // to fix overwriting use FileWriter and append
            // append using FileWriter to append all new data written to end of file
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));

            pw.println(name + ":" + number);

            //we need to close the print writer to end it.
            pw.close();

            //now use try catch for exceptions  such as dividing by zero
            //this will run the code, catch the exception, and tell us what the issue is
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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











