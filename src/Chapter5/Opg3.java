package Chapter5;

public class Opg3 {
    public static void main(String[] args) {
        fermat(3,5,6,4);
    }
    public static void fermat(double a, double b, double c, double n) {

        if (n > 2 && (Math.pow(a, n) + (Math.pow(b, n)) == (Math.pow(c, n)))) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn't work.");
        }
    }
}
