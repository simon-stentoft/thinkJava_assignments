package Chapter4;


public class Opg1 {

    public static void main(String[] args) {

        printEuropean("Monday",9,"September",2021);

        printAmerican("Monday","September",9,2021);

    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: " + day + ", " + date + " " + month + ", " + year);
    }

    public static void printAmerican(String day, String month,int date, int year) {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }
}
