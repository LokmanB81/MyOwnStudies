package student_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraydekiElemanlariSiralama_deneme {
    public static void main(String[] args) {
        /*
        Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
        input : String sehirler[] = {"Trabzon","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
        output: [Çanakkale, Şanlıurfa, İstanbul, Trabzon, Sinop, Hatay, Ordu, Van]

         */
        String sehirler[] = {"Ordu","Trabzon","Ankara","Mus","Agri","Hatay","Istanbul","Van","Izmir","Sakarya"};

/*
        cozum icin 2 yeni list olusturdum.list'lerden birine verilen sehirler array'indeki
        elementleri aktardim.(tempSehirler)
        diger list'i  tempSehirler'de arayip buldugum en uzun karakterli sehir ismini atamak icin kullandim.
        arayip bulma islemi icin ilk once bir degisken olusturup (uzunSehir) , tempSehirler'in ilk indeksindeki degeri
        bu degiskene atadim.
 */
        List <String> tempSehirler=new ArrayList();
        List <String> siraliSehirler=new ArrayList();

        for (int i = 0; i <sehirler.length ; i++) {

            tempSehirler.add(i, sehirler[i]);
        }
        System.out.println(tempSehirler);

        while (tempSehirler.size()>0) {

            String uzunSehir = tempSehirler.get(0);

            for (int i = 1; i <=tempSehirler.size()-1; i++) {

                if (uzunSehir.length() < tempSehirler.get(i).length()) {
                    uzunSehir = tempSehirler.get(i);

               }

            }

            siraliSehirler.add(uzunSehir);
            tempSehirler.remove(uzunSehir);
        }

        System.out.println("Uzunluga gore dizinin elemanlari : "+siraliSehirler);

    }
}
