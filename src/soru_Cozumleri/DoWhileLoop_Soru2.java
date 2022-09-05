package soru_Cozumleri;

public class DoWhileLoop_Soru2 {
    public static void main(String[] args) {
        /*
        m harfinden c harfine kadar butun harfleri yazdirin
         */

        char ilkHarf='m';
        char sonHarf='c';

        do{
            System.out.print(ilkHarf+" ");
            ilkHarf-=1;

        }while (ilkHarf!=sonHarf-1);
    }
}
