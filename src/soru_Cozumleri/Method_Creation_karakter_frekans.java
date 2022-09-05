package soru_Cozumleri;

public class Method_Creation_karakter_frekans {
    public static void main(String[] args) {


     /*
        Interview sorusu...
        Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
        (Büyük harf-küçük harf ayrımına dikkat ediniz)
        Test data:
        Input = AAABBCDD
        output = A3B2C1D2
                */

        String input="aab  bcccc dddaa  abb bjjjk";

        karakterBirKezYazma(input);


    }

    public static void karakterBirKezYazma(String input) {

        String ilkStr=input;
        String yeniStr=input.replaceAll("\\W", "");
        String benzersizStr=yeniStr.substring(0,1);


        for (int i = 1; i <yeniStr.length() ; i++) {

            if (!benzersizStr.contains(yeniStr.substring(i,i+1))){
                benzersizStr+=yeniStr.substring(i,i+1);

            }

        }
        System.out.println(input);
        System.out.println(benzersizStr);



        }
    }

