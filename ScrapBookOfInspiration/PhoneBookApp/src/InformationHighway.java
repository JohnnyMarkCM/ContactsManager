import java.util.Scanner;

public class InformationHighway {

    public static void main(String[] args) {
        //create menu using function called display menu
        displayMenu();

    }

    public static void displayMenu() {
        //make simple menu

        System.out.println("What would you like to do? (1,2,3...etc)");
        System.out.println("1. Call Contact");
        System.out.println("2. Add Contact");
        System.out.println("3. Find Contact");
        System.out.println("4. Exit");

        //get user input
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        //reading what next interger is, does not actually read new line
        // character which is backslash n
        in.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nWho would you like to call? (Firstname Lastname)");
                break;

            case 2:
                System.out.println("\nWhat is the name of the person you would like to save? " +
                        "(Firstname Lastname");
                System.out.println("\nWhat is the phone number of the person you are " +
                        "saving? (1112223456)");
                break;

            case 3:
                System.out.println("\nWhat is the name of ther person whose phone number you are " +
                        "searching? (Firstname Lastname)");
                break;

            default:

                break;
        }


    }

}
