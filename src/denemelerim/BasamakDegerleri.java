package denemelerim;

import java.util.ArrayList;
import java.util.List;


public class BasamakDegerleri {
    public static void main(String[] args) {

        int input = 153;


        System.out.println(input % 10);//3
        System.out.println(input / 10);//15

        List<Integer> basamakDegerleri = new ArrayList<>();
        int toplam = 0;
        int basDegeri;

        while (input > 0) {


            basDegeri=input%10;
            System.out.println(basDegeri);
            toplam+=Math.pow(basDegeri,3);

            input /= 10;

        }

        System.out.println(toplam);
    }
}