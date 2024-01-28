package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class _3_DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //депозирана сума - Double (реално число)
        double depositSum = Double.parseDouble(scanner.nextLine());
        //срок на депозита (в месеци) - int (цяло число)
        int timeForDepositInMonths = Integer.parseInt(scanner.nextLine());
        //годишен лихвен процент  - Double (реално число)
        double yearlyRatePercentage = Double.parseDouble(scanner.nextLine());
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        //v1
        double sum = depositSum + timeForDepositInMonths * ((depositSum * (yearlyRatePercentage / 100)) / 12);
        //v2
        //Double yearlyDeposit = (depositSum * (yearlyRatePercentage / 100)) / 12
        //Double sum = depositSum + timeForDepositInMonths * yearlyDeposit

        //печатай сумата
        System.out.println(sum);
    }
}
