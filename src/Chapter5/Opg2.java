package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Opg2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        System.out.print("Can you guess the number between 1 and 100? ");
        System.out.print("What is your guess?: ");

        int input = scanner.nextInt();
        System.out.println("You guessed " + input + ".");

        while (true) {
            if (attempts == 2) {
                System.out.println("You couldn't guess the correct number, the number was " + number + ".");
                break;
            }
            if (input > number) {
                System.out.print("You guessed too high, try again: ");
                attempts++;
                input = scanner.nextInt();
            }
            else if (input < number) {
                System.out.print("You guessed too low, try again: ");
                input = scanner.nextInt();
                attempts++;
            }
            else
                System.out.println("You guessed correctly!");
        }
    }
}
