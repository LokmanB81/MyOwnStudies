package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_5 {
    public static void main(String[] args) {
     /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char finalNotu= 'C';

        String result= finalNotu=='A' ? "gayet basarili" : finalNotu=='B' ? "basarili" :
                finalNotu=='C' ? "ha gayret": "digerleri";
        System.out.println(result);

    }
}
