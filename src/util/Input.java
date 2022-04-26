package util;

import java.util.Scanner;

public class Input {

    //    ------------------- EXERCISE 1.----------------

    //PROPERTIES
    public static Scanner scanner;

    //    CONSTRUCTOR

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public char[] getString() {
        return scanner.nextLine().toCharArray();
    }

    // GETTERS AND SETTERS

//    public String getString() {
////        System.out.println(prompt);
//        return this.scanner.nextLine();
//    }

}
