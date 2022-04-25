import util.Input;

import java.util.HashMap;

public class ContactHashmap {

    private static HashMap<String, Contacts> contacts = new HashMap<>();


    //------------------GET CONTACTS METHOD----------------------
    public static HashMap<String, Contacts> getContacts() {
        if (contacts.isEmpty()) {
            Contacts c1 = new Contacts("Jenny", 77380, "867-5309");
            c1.addZip(77382);
            Contacts c2 = new Contacts("Jane", 77380, "936-999-0101");
            c2.addZip(77380);

            contacts.put(c1.name, c1);
            contacts.put(c2.name, c2);
        }
        return contacts;
    }


    //-----------CONTACT SEARCH BY NAME METHOD------------
    public static HashMap<String, Contacts> searchContacts() {
        Input userSelection = new Input();
        String userInput = userSelection.scanner.next();
        HashMap<String, Contacts> contacts = getContacts();
//        if (contacts.containsKey(userInput)) {
//            System.out.println(contacts.get(userInput));
//        } else {
//            System.out.println("Contact not found");
//        }
//        return contacts;
        switch (userInput.toLowerCase()) {
            //switch (userInput && ignorecase)
            case "jenny":
                System.out.println(contacts.get("Jenny").getName());
                System.out.println(contacts.get("Jenny").getPhone());
                System.out.println(contacts.get(userInput));
                break;
            case "Jane":
                System.out.println(contacts.get("Jane").getName());
                System.out.println(contacts.get("Jane").getPhone());
                System.out.println(contacts.get(userInput));
                break;

    }
        return contacts;

    }
}

//        if (contacts.containsKey(userInput)) {
//            System.out.println(contacts.get(userInput));
//        } else {
//            System.out.println("Contact not found");
//        }
//        return contacts;
//change to switch statement and ignore case



//

//default:
//        System.out.println("Contact not found");
//        break;

//        for (Contacts person : ContactHashmap.getContacts().values()) {
//            if (person.name.compareToIgnoreCase(userInput) == 0) {
//                System.out.println(person.getName());
//                System.out.println(person.getPhone());
//                //else statement if user input is not found
//            } else {
//                //TODO: remove this else statement
//                System.out.println("Contact not found TODO REMOVE ME");
//
//            }
//        }
//        return contacts;


//-------------------------------------------------------













