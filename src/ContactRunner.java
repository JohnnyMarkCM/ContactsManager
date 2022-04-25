public class ContactRunner {

    public static void main(String[] args) {

        System.out.println(
                "**************************************************************************************");
        System.out.println("Welcome! Here are the contacts:");
        System.out.println(
                "**************************************************************************************");

        //INSTANTIATES/PRINT CONTACTS MENU
        ContactsManagerMenu list = new ContactsManagerMenu();
        list.userMenuSelection();

    }
}
