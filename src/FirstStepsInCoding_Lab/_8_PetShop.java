package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _8_PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //"{крайната сума} lv."
        //брой опаковки за кучета (int)
        int numberOfPacksForDogs = Integer.parseInt(scanner.nextLine());
        //брой опаковки за котки (int)
        int numberOfPacksForCats = Integer.parseInt(scanner.nextLine());
        //цената на една опаковка за кучета (double)
        double PriceOfPacksForDogs = numberOfPacksForDogs * 2.50;
        //цената на една опаковка за котки (double)
        double PriceOfPacksForCats = numberOfPacksForCats * 4.00;
        //обща цена
        double totalPrice = PriceOfPacksForDogs + PriceOfPacksForCats;
        //печатай сумата
        System.out.printf("%.1f lv.", totalPrice);

    }
}
