package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class Opg4 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Can you guess the number between 1 and 100?");
        System.out.print(" What is your guess?: ");

        int input = scanner.nextInt();
        System.out.println("You guessed " + input + ".");

        System.out.println("The correct number is " + number + ".");

        int offBy = number - input;

        if (input == number)
            System.out.println("You guessed correctly!");
        else
            System.out.println("You were off by: " + offBy + ".");

    }
}
