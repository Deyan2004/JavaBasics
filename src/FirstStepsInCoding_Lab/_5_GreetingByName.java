package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _5_GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //"Hello, <name>!"
        //променлива име на човек (текст - String)
        String name = scanner.nextLine();
        //печатай
        System.out.println("Hello, " + name + "!");
    }
}
