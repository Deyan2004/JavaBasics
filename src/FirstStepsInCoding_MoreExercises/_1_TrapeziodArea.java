package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _1_TrapeziodArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //area = (b1 + b2) * h / 2.
        //b1
        double b1 = Double.parseDouble(scanner.nextLine());
        //b2
        double b2 = Double.parseDouble(scanner.nextLine());
        //h
        double h = Double.parseDouble(scanner.nextLine());
        //area
        double area = (b1 + b2) * h / 2.0;
        //print area
        System.out.printf("%.2f", area);

    }
}
