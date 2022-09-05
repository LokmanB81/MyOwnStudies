package soru_Cozumleri;

public class Cm_To_Meter {
    public static void main(String[] args) {
         /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        double input=130;

        metreDonustur(input);
    }

    public static void metreDonustur(double input) {

        System.out.println(input+" cm = "+ (input/100)+" mt ve "+(input/100000)+" km'dir");


    }
}
