
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class ContactHashmap {

    private static HashMap<String, Contacts> contacts = new HashMap<>();

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




}
