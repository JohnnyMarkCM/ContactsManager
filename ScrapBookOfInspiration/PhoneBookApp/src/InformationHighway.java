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
        in.nextLine();
        


    }

}
