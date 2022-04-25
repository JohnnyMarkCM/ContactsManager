public class ContactRunner {

    public static void main(String[] args) {

        System.out.println(
                "**************************************************************************************");
        System.out.println("Welcome! Here are the contacts:");
        System.out.println(
                "**************************************************************************************");

        //instantiate a new Contact
        ContactsManagerMenu list = new ContactsManagerMenu();
        list.userMenuSelection();

    }
}
