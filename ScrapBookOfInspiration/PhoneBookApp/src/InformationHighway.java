import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InformationHighway {

    public static void main(String[] args) {
        displayMenu();
    }

    public static void callContact(String name) {
        System.out.println("Calling " + name);
    }

    public static void addContact(String name, long number) {
        System.out.println("Adding contact " + name + ": " + number);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("file.txt", true));
            pw.println(name + ":" + number);

            pw.close();     //needs to remain here

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findNumber(String name) {
        //change output once we have an addressbook
        System.out.println("Could not find " + name);
    }

    public static void displayMenu() {
        //make simple menu

        //get user input
        try (Scanner in = new Scanner(System.in)) {
            String name;

            System.out.println("What would you like to do? (1,2,3...etc)");
            System.out.println("1. Call Contact");
            System.out.println("2. Add Contact");  //aka save contact
            System.out.println("3. Find Number");
            System.out.println("4. Exit");

            //reading what next integer is, does not actually read new line
            // character which is backslash n
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nWho would you like to call? (Firstname Lastname)");
                    name = in.nextLine();

                    callContact(name);
                    break;

                case 2:
                    System.out.println("\nWhat is the name of the person you would like to save? " +
                            "(Firstname Lastname");
                    name = in.nextLine();

                    System.out.println("\nWhat is the phone number of the person you are " +
                            "saving? (1112223456)");
                    long number = in.nextLong();
                    in.nextLine();


                    addContact(name, number);
                    break;

                case 3:
                    System.out.println("\nWhat is the name of ther person whose phone number you " +
                            "are " +
                            "searching? (Firstname Lastname)");
                    // below is passed in as an argument because it will return string of entire
                    // line
                    findNumber(in.nextLine());
                    break;

                default:

                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
