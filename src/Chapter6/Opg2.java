package Chapter6;

public class Opg2 {
    public static void main(String[] args) {
        double result = squareRoot(16);
        System.out.println(result);
    }
    public static double squareRoot(double a) {
        double x = a/2;
        double oldX = (-1);

        for (int i = 0; Math.abs(oldX - x) > 0.0001; i++) {
            oldX = x;
            x = (x + a/x) / 2;
        }
        return x;
    }
}
