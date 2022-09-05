package soru_Cozumleri;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Fibonacci_2 {
    public static void main(String[] args) {
        /*
        verilen bir sayidan kucuk tum fibonacci sayilarini bir
        liste olarak olusturp yazdirin
         */
        int istenenDeger=10;
        int sonuc=0; int ilkDeger=1;int toplam=0;
        List<Integer> fibonacciList=new ArrayList<>();

      while (toplam<istenenDeger){
             toplam=sonuc+ilkDeger;
             if(toplam<istenenDeger) {
                 fibonacciList.add(toplam);
             }
            ilkDeger=sonuc; sonuc=toplam;
        }
        System.out.println(fibonacciList);
    }
}
