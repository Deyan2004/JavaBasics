package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _4_InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // печатай ИНЧОВЕ към сантиметри
        //първо създай променлива - инчове (РЕАЛНО ЧИСЛО!!!!)
        double inches = Double.parseDouble(scanner.nextLine());
        //второ създай променлива - сантиметри, която умножава инчове по 2.54
        double centimeters = inches * 2.54;
        //принтирай сантиметрите
        System.out.println(centimeters);
    }
}
