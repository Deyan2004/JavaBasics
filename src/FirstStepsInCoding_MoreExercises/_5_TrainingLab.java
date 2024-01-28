package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _5_TrainingLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //height (дължина) - double
        double height = Double.parseDouble(scanner.nextLine()) * 100;
        //width (широчина) - double
        double width = Double.parseDouble(scanner.nextLine()) * 100;
        //working place in width
        int workingPlaceInWidth = (int) (width - 100) / 70;
        //working place in height
        int workingPlaceInHeight = (int) height / 120;
        //total working places
        int totalWorkingPlaces = workingPlaceInWidth * workingPlaceInHeight - 3;
        //print working places
        System.out.println(totalWorkingPlaces);



    }
}

