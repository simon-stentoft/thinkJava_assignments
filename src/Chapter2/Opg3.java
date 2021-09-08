package Chapter2;

public class Opg3 {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 3;
        int second = 43;

        //Number of seconds since midnight
        System.out.println("Number of seconds since midnight: " + ((hour * 60 * 60) + minute * 60 + second));

        System.out.println("Seconds remaining of the day: " + (86400 - hour * 60 * 60 - minute * 60 - second));

        float a = 39823;
        float b = 86400;
        float remainingDayPercentage = a / b;
        System.out.println("Percentage of the day that has passed: " + remainingDayPercentage * 100 + " %");
    }
}
