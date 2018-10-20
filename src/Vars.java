import java.text.DecimalFormat;

public class Vars {

    public static void main(String[] args) {

        String w = "gsgs";



        /*final int DAYS_IN_WEEK = 7;
        int numberOfCats = 20;
        System.out.println(numberOfCats);
        byte b = 120;
        float f = 3.14F;
        double d = 3.1454683564;

        System.out.println(d);

        java.lang.String str = "To jest piękne wyrazenie";
        int a =1;
        int x;
        x = 10;
        int y=15;
        String q = "napis";
        String w = "napis2";
*/

        double x = 12e22; //12*10^22
        double y = 12e-22; //12*10^-22

        System.out.println(x);

        DecimalFormat decimalFormat = new DecimalFormat( "##################################");

        System.out.println(y);
        System.out.println(decimalFormat.format(y));

        //int i =3500000;
        int i = 3_500_000;

        int a=5;
        int b = 2;
        System.out.println(a / b);
        System.out.println(5f / b);
        System.out.println(a / 2f);
        System.out.println(a / 2.);




    }
}
