package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _3_RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // печатай резултата от лицето на правоъгълник = a*b
        //първа страна
        int sideA = Integer.parseInt(scanner.nextLine());
        //втора страна
        int sideB = Integer.parseInt(scanner.nextLine());
        //лицето
        int area = sideA * sideB;

        System.out.println(area);
    }
}
