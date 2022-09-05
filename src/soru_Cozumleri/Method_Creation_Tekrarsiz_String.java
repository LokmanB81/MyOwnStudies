package soru_Cozumleri;

public class Method_Creation_Tekrarsiz_String {
    public static void main(String[] args) {


     /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
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

