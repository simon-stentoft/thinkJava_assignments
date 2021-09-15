package Chapter6;

public class Opg4 {
    public static void main(String[] args) {
        isAbecedarian("HEj");


    }
    public static boolean isAbecedarian(String s) {
        String string = s.toLowerCase();

        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) <= string.charAt(i + 1)) {
                System.out.println("String is abecedarian.");
            }
            else
                System.out.println("String is not abecedarian.");
        }
        return true;
    }
}
