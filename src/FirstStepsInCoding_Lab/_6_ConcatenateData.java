package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _6_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        //име, фамилия, възраст и град
        //име (String)
        String firstName = scanner.nextLine();
        //фамилия(String)
        String lastName = scanner.nextLine();
        //възраст (int)
        int age = Integer.parseInt(scanner.nextLine());
        //град (String)
        String city = scanner.nextLine();
        //печатай променливите в горния текст
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + city + ".");




    }
}
