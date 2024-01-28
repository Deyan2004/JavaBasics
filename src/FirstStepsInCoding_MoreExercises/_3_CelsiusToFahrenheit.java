package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _3_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Celsius -> Fahrenheit
        //Celsius
        double celsius = Double.parseDouble(scanner.nextLine());
        //Fahrenheit - °C × 1,8 + 32
        double fahrenheit = celsius * 1.8 + 32;
        //print fahrenheit
        System.out.printf("%.2f", fahrenheit);
    }
}
