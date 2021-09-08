package Chapter3;

import java.util.Scanner;

public class Opg2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double input = scanner.nextDouble();

        double fahrenheit = ((input * 1.8) + 32);

        System.out.printf("%.2f C = %.2f F",input,fahrenheit);
    }
}
