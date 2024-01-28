package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _9_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //It's warm outside!
        //It's cold outside!

        String weather = scanner.nextLine();

        if (weather.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }
}
