import util.Input;


public class ContactsManagerMenu {


    public static void userMenuSelection() {
        ContactHashmap list = new ContactHashmap();
        Input userSelection = new Input();
        int num;

        //--------------------------- SWITCH CASE------------------------------
        boolean continueRunning = true;

        do {
            System.out.println(
                    "**************************************************************************************");
            System.out.println("Welcome! Here are the contacts:");
            System.out.println(
                    "**************************************************************************************");
            System.out.println("Please make a selection from the list below...");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact.");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");
            System.out.println("5 - Exit.");

            System.out.println("Enter an option (1, 2, 3, 4 or 5):");

            num = Input.scanner.nextInt();

            switch (num) {


                case 1:
                    System.out.println(list.printList());
                    System.out.println("You selected View contacts.");
                    break;

                case 2:
                    System.out.println("You selected Add a new contact.");
                    break;
                case 3:
                    System.out.println("You selected Search a contact by name.");
                    break;
                case 4:
                    System.out.println("You selected Delete an existing contact.");
                    break;
                case 5:
                    System.out.println("OK, bye Felicia!");
                    continueRunning = false;
                default:
                    if (num < 1 || num > 5) {
                        System.out.println("that's not an option");
                    }
            }
        } while (continueRunning);
        System.out.println("exiting loop");
    }
}
