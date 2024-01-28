package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vegetable price per kilogram - double
        double vegetablePricePerKilogram = Double.parseDouble(scanner.nextLine());
        //fruit price per kilogram - double
        double fruitPricePerKilogram = Double.parseDouble(scanner.nextLine());
        //vegetable total kilograms - int
        int vegetableKilogram = Integer.parseInt(scanner.nextLine());
        //fruit total kilograms - int
        int fruitKilogram = Integer.parseInt(scanner.nextLine());
        //euro = 1.94 lv.
        //vegetable price
        double vegetablePrice = vegetablePricePerKilogram * vegetableKilogram;
        //fruit price
        double fruitPrice = fruitPricePerKilogram * fruitKilogram;
        //total price
        double totalPrice = vegetablePrice + fruitPrice;
        //total price converted in euros
        double totalPriceInEuros = totalPrice / 1.94;
        //print total price in euros
        System.out.printf("%.2f", totalPriceInEuros);


    }
}
