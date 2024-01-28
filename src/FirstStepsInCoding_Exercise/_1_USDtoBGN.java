package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _1_USDtoBGN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //долари -> лева
        //долари (Double - реално число)
        double usDollars = Double.parseDouble(scanner.nextLine());
        //лева (Double - реално число) = 1.79549 * usd
        double bgLeva = usDollars * 1.79549;

        //принтирай левовете
        System.out.println(bgLeva);
    }
}
