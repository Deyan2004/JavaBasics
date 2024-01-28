package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _8_CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Area - πR2
        //Perimeter	C = 2πR
        //radius
        double radius = Double.parseDouble(scanner.nextLine());
        //area
        double area = Math.PI * radius * radius;
        //perimeter
        double perimeter = 2 * Math.PI * radius;
        //print area & perimeter
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
