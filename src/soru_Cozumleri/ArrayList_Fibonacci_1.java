package soru_Cozumleri;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Fibonacci_1 {
    public static void main(String[] args) {

        /*
        // 1 den baslayarak istenen kadar fibonacci sayisini
        bir liste olarak olusturup yazdirin.
         */

        double istenenDeger=100;
        double sonuc=0; double ilkDeger=1;
        List<Double> fibonacciList=new ArrayList<>();

        for (int i = 1; i <=istenenDeger ; i++) {

            double toplam=sonuc+ilkDeger;
            fibonacciList.add(toplam);
            ilkDeger=sonuc; sonuc=toplam;


        }
        System.out.println(fibonacciList);

    }
}
