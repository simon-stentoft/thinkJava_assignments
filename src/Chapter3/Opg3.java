package Chapter3;

import java.util.Scanner;

public class Opg3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int input = scanner.nextInt();
        int timeSeconds = input % 60;
        int timeHours = input / 60;
        int timeMinutes = timeHours % 60;
        timeHours = timeHours / 60;


        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.",input,timeHours,timeMinutes,timeSeconds);
    }
}
