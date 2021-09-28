package Chapter8;

public class Opg1 {
    public static void main(String[] args) {
        bottlesOfBeer(4);
    }

    public static void bottlesOfBeer(int beer) {
        if (beer == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        }
        else if(beer == 1) {
            System.out.println(beer + " bottle of beer on the wall,\n" +
                    beer + " bottle of beer,\n" +
                    "ya’ take one down, ya’ pass it around,");
            bottlesOfBeer(beer - 1);
        }
        else {
            System.out.println(beer + " bottles of beer on the wall,\n" +
                    beer + " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around,");
            bottlesOfBeer(beer - 1);
        }
    }
}
