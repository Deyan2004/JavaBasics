package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //брой страници - int (цяло число)
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        //страници на 1 час - int (цяло число)
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        //броят на дните - int (цяло число)
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        //брой страници / броят страници на 1 час = броят часове
        int totalHours = numberOfPages/pagesPerHour;
        //броят часове / броят на дните = часове на ден
        int hoursPerDay = totalHours/numberOfDays;

        //печатай часовете на ден
        System.out.println(hoursPerDay);
    }
}
