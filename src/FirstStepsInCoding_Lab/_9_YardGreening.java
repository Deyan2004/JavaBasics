package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"The final price is: {крайна цена на услугата} lv."
        //"The discount is: {отстъпка} lv."
        //кв.метри, които ще бъдат озеленени
        double sqrMeters = Double.parseDouble(scanner.nextLine());
        //цената на един кв. м. по броят
        double pricePerSqrMeter = sqrMeters * 7.61;
        //остъпката
        double discountPrice = pricePerSqrMeter * 0.18;
        //изваждаме цената на остъпката
        double priceAfterDiscount = pricePerSqrMeter - discountPrice;
        //печатаме резултата със съобщенията
        System.out.printf("The final price is: %.2f lv.%n", priceAfterDiscount);
        System.out.printf("The discount is: %.2f lv.", discountPrice);
    }
}