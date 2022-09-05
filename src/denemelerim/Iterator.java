package denemelerim;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(22);
        sayilar.add(56);
        sayilar.add(13);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);
        System.out.println(sayilar);

        ListIterator it= sayilar.listIterator();

        while (it.hasNext()){

        }



    }
}
