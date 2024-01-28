package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //yearly price for basketball training - int
        int yearlyPriceForTraining = Integer.parseInt(scanner.nextLine());

        //basketball trainers price = 40% from yearly price for basketball training - double
        double trainersPrice = yearlyPriceForTraining - (yearlyPriceForTraining * 0.40);
        //basketball jersey price = 20% from basketball trainers price - double
        double jerseyPrice = trainersPrice - (trainersPrice * 0.20);
        //basketball price = 1/4 (4) from basketball jersey price - double
        double basketballPrice = jerseyPrice / 4;
        //basketball accessories = 1/5 (5) from basketball price - double
        double accPrice = basketballPrice / 5;
        //total price
        double totalPrice = yearlyPriceForTraining + trainersPrice + jerseyPrice + basketballPrice + accPrice;

        //print total price
        System.out.println(totalPrice);
    }
}
