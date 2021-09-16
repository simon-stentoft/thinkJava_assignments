package Chapter6;

public class Opg4 {
    public static void main(String[] args) {
        isAbecedarian("HEj");


    }
    // Der er noget galt med den måde den skriver både "String is abecedarian." og "String is not abecedarian." fx med test-ordet hEJ. Ved et ord som er abecedarian,
    // skriver den "String is abecedarian." lige så mange gange som der er bogstaver i ordet. 
    // Funktionen returnerer altid true. Return true i linjen efter "System.out.println("String is abecedarian.");" i stedet for efter loopet. Beslut om du vil printe eller bruge return.
    public static boolean isAbecedarian(String s) {
        String string = s.toLowerCase();
    // Husk at bruge s ikke string herunder. s er jo den version som er rettet til små bogstaver.
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
