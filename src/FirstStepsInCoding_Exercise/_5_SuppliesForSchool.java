package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _5_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //брой пакети химикали - int (цяло число)
        int numberOfPens = Integer.parseInt(scanner.nextLine());
        //брой пакети маркери - int (цяло число)
        int numberOfMarkers = Integer.parseInt(scanner.nextLine());
        //литри препарат - int (цяло число)
        int cleanerForWhiteboard = Integer.parseInt(scanner.nextLine());
        //процент намаление - int (цяло число)
        int discountPercent = Integer.parseInt(scanner.nextLine());

        //Пакет химикали - 5.80 лв.
        double pensPrice = numberOfPens * 5.80;
        //Пакет маркери - 7.20 лв.
        double markersPrice = numberOfMarkers * 7.20;
        //Препарат - 1.20 лв (за литър)
        double cleanerPrice = cleanerForWhiteboard * 1.20;

        //обща цена
        double totalPrice = pensPrice + markersPrice + cleanerPrice;
        //общата цена със намеление
        double totalPriceWithDiscount = totalPrice - (totalPrice * (discountPercent / 100.0));

        //печатай крайна сума
        System.out.println(totalPriceWithDiscount);
    }
}
