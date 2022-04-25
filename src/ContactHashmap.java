
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class ContactHashmap {


    public static Object printList() {
        Scanner scanner = new Scanner(System.in);

//        -------------HASHMAP---------------
        HashMap<String, Contacts> contacts = new HashMap<>();
        Contacts c1 = new Contacts("Jenny", 77380, "867-5309");
        c1.addZip(77382);
        Contacts c2 = new Contacts("Jane", 77380, "936-999-0101");
        c2.addZip(77380);

        //print out the contacts
        System.out.println(c1.getName());
        System.out.println(c1.getPhone());
        System.out.println(c1.getZip());

        System.out.println(c2.getName());
        System.out.println(c2.getPhone());
        System.out.println(c2.getZip());



        //        Print the list of GitHub usernames out to the console, and ask the user which
        //        contact they would like to see more information about.
        for (String key : contacts.keySet()) {
            System.out.println(key);
        }
        //Create command line interface prints list of contacts and their info
        contacts.put(" Jenny", c1);
        contacts.put(" Jane", c2);

        return null;
    }

}
