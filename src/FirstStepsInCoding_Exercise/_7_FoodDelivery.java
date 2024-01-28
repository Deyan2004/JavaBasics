package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _7_FoodDelivery {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            //брой пилешки менюта - int (цяло число)
            int numberOfChicken = Integer.parseInt(scanner.nextLine());
            //брой менюта с риба - int (цяло число)
            int numberOfFish = Integer.parseInt(scanner.nextLine());
            //брой вегетариански менюта - int (цяло число)
            int numberOfVeganFood = Integer.parseInt(scanner.nextLine());

            // пилешко меню - 10,35 лв.
            double priceChicken = numberOfChicken * 10.35;
            // меню с риба - 12,40 лв.
            double priceFish = numberOfFish * 12.40;
            // вегетарианско меню - 8.15 лв.
            double priceVegan = numberOfVeganFood * 8.15;

            // обща цена
            double totalPrice = priceChicken + priceFish + priceVegan;
            // десерт - 20% от общата цена
            double dessert = totalPrice * 0.20;
            //цената на доставка - 2.50лв.
            double totalPriceWithDelivery = totalPrice + dessert + 2.50;

            // печатай общата сума
            System.out.println(totalPriceWithDelivery);
        }
    }


