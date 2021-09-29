package Chapter8;

public class Opg2 {
    public static void main(String[] args) {
        System.out.println(oddSum(5));
    }

    public static int oddSum(int n) {
        if (n == 0) { //Need this or it will go on forever.
            return 0;
        }
        if (n % 2 != 0) {
            return n + oddSum(n - 1);
        } else {
            return oddSum(n - 1);
        }
    }
}
