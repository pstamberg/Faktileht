import java.util.ArrayList;

/**
 * Created by Peeter on 6.10.2016.
 */
public class Faktileht {
    public static void main(String[] args) {
        System.out.println("Tere!");
        int minuRaha = 150;
        int ostukorv = 100;

        minuRaha = minuRaha - ostukorv;
        String minuRahaEurodes = minuRaha + "€";
        System.out.println(minuRaha);
        System.out.println(minuRahaEurodes);

        int[]ostukorv2 = {15, 29, 19, 5, 12};
        ostukorv2[2] = 13;
        System.out.println(ostukorv2[0]); //prindib selle mida valisid
    }
}
