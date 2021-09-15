package Chapter6;

public class Opg1 {
    public static void main(String[] args) {
        loop(533);
    }

    //Any number will eventually be reduced to 1 and then the program will end. The else statement makes sure that any number not divisible by 2 will in the next loop be divisible again.
    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}
