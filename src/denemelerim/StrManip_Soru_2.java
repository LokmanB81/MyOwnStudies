package denemelerim;

public class StrManip_Soru_2 {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";

       // System.out.println(str1.replace("$",""));
       // System.out.println(str2.replace("$",""));

        System.out.println("$" + (Double.parseDouble(str1.replace("$", "")) +
                Double.parseDouble(str2.replace("$", ""))));


    }
}
