package denemelerim;

public class StringManipulation_1 {
    public static void main(String[] args) {

        String ad="ali";String ad1="ali";
        String soyad="can";
        System.out.println(ad+ " "+ soyad);

        System.out.println(ad.concat(soyad));
        System.out.println(soyad.charAt(2));
        System.out.println(ad.toLowerCase()+" "+soyad.toUpperCase());
        System.out.println(2+3!=5);
        System.out.println(ad.equals("ali"));
        System.out.println(ad==ad1);
        //System.out.println(soyad.toUpperCase());

    }
}
