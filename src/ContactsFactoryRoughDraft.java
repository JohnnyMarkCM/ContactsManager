
import java.util.HashMap;
import java.util.Scanner;

public class ContactsFactoryRoughDraft {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //HashMap named contacts with keys of type String and values of type Student Objects with
        // 2 Contact Objects with
        HashMap<String, ContactRoughDraft> contacts = new HashMap<>();
        ContactRoughDraft c1 = new ContactRoughDraft("John", 24);
        c1.addAge(24);
        ContactRoughDraft c2 = new ContactRoughDraft("Jane", 21);
        c2.addAge(21);


        System.out.println(
                "**************************************************************************************");
        System.out.println("Welcome! Here are the contacts:");
        System.out.println(
                "**************************************************************************************");
        //        Print the list of GitHub usernames out to the console, and ask the user which
        //        student they would like to see more information about.

        for (String key : contacts.keySet()) {
            System.out.println(key);
        }
        //Create command line interface prints list of contacts and their getgrades
        contacts.put(" John", c1);
        contacts.put(" Jane", c2);


        System.out.println("Which contact would you like to see more information about?");
        System.out.println("----------------------------------------------------");


        //Enter 1 for gitusername1 and 2 for gitusername2 and 3 for gitusername3 and 4 for
        // gitusername4
//        System.out.println(
//                "Enter number and return/enter:\n  1 for uniqueGitName\n  2 for " +
//                        "SuperUniqueGitName\n  3 " +
//                        "for gitNameOfSomeSort\n  4 for anotherGitName");
//        System.out.println("----------------------------------------------------");
    }
}

//        int userInput = scanner.nextInt();
//        if (userInput == 1) {
//            System.out.println(c1.getGitusername() + "'s grades are: " + c1.getGrades());
//        } else if (userInput == 2) {
//            System.out.println(c2.getGitusername() + "'s grades are: " + c2.getGrades());
//        } else if (userInput == 3) {
//            System.out.println(c3.getGitusername() + "'s grades are: " + c3.getGrades());
//        } else if (userInput == 4) {
//            System.out.println(c4.getGitusername() + "'s grades are: " + c4.getGrades());
//        //output if invalid git username or student not in hashmap
//        else {
//            System.out.println("Invalid git username or student not in hashmap");
//        }
//        // Press 1 to continue original program or 2 to exit
//        System.out.println("Press 1 to restart program or 2 to exit");
//        int userInput2 = scanner.nextInt();
//        if (userInput2 == 1) {
//            main(args);
//        } else if (userInput2 == 2) {
//            System.out.println("Goodbye!");
//        }


//        //ask the user which student they want to see grades for
//        System.out.println("Enter the git username of the student you would like to see grades " +
//                "for");
//        String gitUsername = scanner.nextLine();
//
//        //if the student is in the hashmap, print the grades
//        if (contacts.containsKey(gitUsername)) {
//            Contact contact = contacts.get(gitUsername);
//            System.out.println("The grades for " + contact.getName() + " are: " + contact
//            .getGrades());
//        }




//        if (students.containsKey(gitUsername)) {
//            System.out.println("The grades for " + gitUsername + " are: " + students.get
//            (gitUsername).getGrades());
//        }


//    public double getGradeAverage() {
//        return (double) grade / 3;


//ask the user if they want to continue and keep running if they do


//        students = new HashMap<String, Student>();
//        grades = new HashMap<String, Grade>();


//    public static void main(String[] args) {
//     HashMap<String, Integer> grades = new HashMap<>();
//     grades.put("A", 90);
//     grades.put("B", 80);
//     grades.put("C", 70);
//     grades.put("D", 60);
//     grades.put("F", 50);
//     grades.put("Excellent!", 100);
//         System.out.println(grades);


//public class ContactsFactoryRoughDraft {
//
//
//
//}
