package student_practice;

import denemelerim.Str;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydekiElemanlariSiralama {
    public static void main(String[] args) {
        /*
        Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
        input : String sehirler[] = {"Trabzon","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
        output: [Çanakkale, Şanlıurfa, İstanbul, Trabzon, Sinop, Hatay, Ordu, Van]

         */
        String sehirler[] = {"Trabzon","Ankara","Mus","Agri","Hatay","Istanbul","Van","Rize","Izmir"};


       List <String> siraliSehirler=new ArrayList();

        for (int i = 0; i <sehirler.length ; i++) {

            siraliSehirler.add(i,sehirler[i]);

        }

        System.out.println("ilk array : "+Arrays.toString(sehirler));
        System.out.println("listarray :"+siraliSehirler);

       for (int i = 0; i < sehirler.length-2; i++) {

            for (int j = i+1; j <= sehirler.length-1 ; j++) {

                if(sehirler[i].length()> sehirler[j].length()){

                    siraliSehirler.set(i,sehirler[i]);
                }
               else{
                    siraliSehirler.set(i,sehirler[j]);
                }

            }


        }


       System.out.println(siraliSehirler);
    }
}
