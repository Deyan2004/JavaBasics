package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class _7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //height of the house
        double heightHouse = Double.parseDouble(scanner.nextLine());
        //length of the sidewall
        double lengthSidewall = Double.parseDouble(scanner.nextLine());
        //height of the triangular wall of the roof
        double heightRoofWall = Double.parseDouble(scanner.nextLine());
        //sidewall area = height of the house multiplied by length of the sidewall
        double sidewall = heightHouse * lengthSidewall;
        //both sidewalls
        double bothSidewalls = (2 * sidewall) - (2 * 2.25);
        //backside wall
        double backsideWall = heightHouse * heightHouse;
        //both front and back walls
        double frontAndBack = 2 * backsideWall - (1.2 * 2);
        //total wall size
        double totalWallSize = bothSidewalls + frontAndBack;
        //green paint
        Double greenPaint = totalWallSize / 3.4;
        //roof rectangular
        double roofRectangular = 2 * (heightHouse * lengthSidewall);
        //roof triangle
        double roofTriangles = 2 * ((1.0 * heightHouse * heightRoofWall) / 2);
        // total roof size
        double totalRoofSize = roofRectangular + roofTriangles;
        // red paint
        double redPaint = totalRoofSize / 4.3;
        //print green & red paint
        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f%n", redPaint);


    }
}
