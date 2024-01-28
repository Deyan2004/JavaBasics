package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _2_RadiansToDegrees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //радиани -> градуси
        //радиани (Double = реални числа)
        double radians = Double.parseDouble(scanner.nextLine());
        //градус (Double) = радиан * 180 / π.
        double degrees = radians * 180 / Math.PI;

        //принтирай градусите
        System.out.println(degrees);

    }
}
