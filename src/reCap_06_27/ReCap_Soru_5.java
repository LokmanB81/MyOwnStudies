package reCap_06_27;

public class ReCap_Soru_5 {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        double fiyat=90;
        System.out.println(fiyat<10 ? "ucuz":fiyat<20 ? "normal": "pahalı");

    }
}
