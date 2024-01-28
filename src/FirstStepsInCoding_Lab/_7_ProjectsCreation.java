package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        //име на архитекта (String)
        String architectName = scanner.nextLine();
        //брой на проектите, които трябва да изготви (int)
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        //часове - брой на проектите x 3
        int hoursPerProject = numberOfProjects * 3;
        //печатай съобщението
        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                , architectName, hoursPerProject, numberOfProjects);

    }
}
