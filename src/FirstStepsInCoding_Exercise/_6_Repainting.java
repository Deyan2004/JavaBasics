package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _6_Repainting {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        //nylon - int
        int nylon = Integer.parseInt(scanner.nextLine());
        //paint - int
        int paint = Integer.parseInt(scanner.nextLine());
        //thinner - int
        int thinner = Integer.parseInt(scanner.nextLine());
        //hours for work - int
        int workingHours = Integer.parseInt(scanner.nextLine());
        //nylonPrice = (nylon + (nylon * 0.10)) * 1.50
        double nylonPrice = (nylon + 2) * 1.50;
        //paintPrice = (paint + 2) * 14.50
        double paintPrice = (paint + (paint * 0.10)) * 14.50;
        //thinnerPrice = thinner * 5
        double thinnerPrice = thinner * 5;

        //bags = 0.40;
        //total price
        double totalPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        //price for hour + 30%
        double totalPricePerHour = (totalPrice * 0.30) * workingHours;
        //sum with total price & price for hour
        double totalSum = totalPrice + totalPricePerHour;

        //print the total price
        System.out.println(totalSum);
    }
}