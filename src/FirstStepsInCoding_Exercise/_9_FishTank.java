package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //length - int
        int length = Integer.parseInt(scanner.nextLine());
        //width - int
        int width = Integer.parseInt(scanner.nextLine());
        //height - int
        int height = Integer.parseInt(scanner.nextLine());
        //percent - double
        double percent = Double.parseDouble(scanner.nextLine());

        //volume - l * w * h
        double volumeInLiters = (length * height * width) * 0.001;
        //volume percent - volume * (liter - percent)
        double volumeWithPercent = volumeInLiters * (1 - (percent / 100));

        //print volume
        System.out.println(volumeWithPercent);
    }
}
