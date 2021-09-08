package Chapter3;

import java.util.Random;

public class Opg4 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

    }
}
