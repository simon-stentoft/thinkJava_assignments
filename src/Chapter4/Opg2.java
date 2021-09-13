package Chapter4;

public class Opg2 {
    public static void main(String[] args) {
        zippo("rattle", 13);
    }


    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }


    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
      /*1*/  System.out.println("ik");
            /*2*/ baffle(quince);
            /*3*/System.out.println("boo-wa-ha-ha");
        }
    }
}