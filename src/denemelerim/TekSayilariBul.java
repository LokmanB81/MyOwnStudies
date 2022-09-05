package denemelerim;

public class TekSayilariBul {
    public static void main(String[] args) {

      // belirli aralitaki odd numbers
      // ornek 5-50 arasi tek sayilar (veya kullanici  50-5 arasi diyebilir)

        int basDeg=50;
        Integer bitDeg=5;

        if (basDeg<bitDeg) {
            for (int i = basDeg + 1; i < bitDeg; i++) {
                if (i % 2 != 0) {
                    System.out.print(i+" ");
                }
            }
        }
             if(basDeg>bitDeg){
                for (int i = bitDeg+1 ; i <basDeg; i++) {
                    if(i%2!=0){
                        System.out.print(i+" ");
                    }
                }
            }



    }
}
