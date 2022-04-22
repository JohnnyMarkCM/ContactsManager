
import java.util.HashMap;
import java.util.Scanner;

public class ContactMain {


    public static Object printList() {
        Scanner scanner = new Scanner(System.in);

        //Call that beautiful menu
//        ContactsManagerMenu.userMenuSelection();

        //HashMap named contacts with keys of type String and values of type Student Objects with
        // 2 Contact Objects with

//        -------------HASHMAP---------------
        HashMap<String, ContactsList> contacts = new HashMap<>();
        ContactsList c1 = new ContactsList("Jenny", 77380, "867-5309");
        c1.addZip(77382);
        ContactsList c2 = new ContactsList("Jane", 77380, "936-999-0101");
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
