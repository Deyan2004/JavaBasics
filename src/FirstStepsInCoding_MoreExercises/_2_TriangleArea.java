package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _2_TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //area = a * h / 2
        //side
        double side = Double.parseDouble(scanner.nextLine());
        //height
        double height = Double.parseDouble(scanner.nextLine());
        //area
        double area = side * height / 2;
        //print area
        System.out.printf("%.2f", area);
    }
}
