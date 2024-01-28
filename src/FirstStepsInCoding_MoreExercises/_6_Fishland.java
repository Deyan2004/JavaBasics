package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _6_Fishland {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //mackerel
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        //sprinkle
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        //bonito
        double bonitoKilogram = Double.parseDouble(scanner.nextLine());
        //safrid
        double safridKilogram = Double.parseDouble(scanner.nextLine());
        //mussels
        int musselsKilogram = Integer.parseInt(scanner.nextLine());
        //bonito - 60% from mackerel
        double bonitoPrice = mackerelPrice + (mackerelPrice * 0.60);
        bonitoPrice = bonitoPrice * bonitoKilogram;
        //safrid - 80% from sprinkle
        double safridPrice = sprinklePrice + (sprinklePrice * 0.80);
        safridPrice = safridPrice * safridKilogram;
        //mussels - 7.50 * mussels
        double musselsPrice = musselsKilogram * 7.50;
        //total price
        double totalPrice = bonitoPrice + safridPrice + musselsPrice;
        //print Price
        System.out.printf("%.2f", totalPrice);
    }
}
