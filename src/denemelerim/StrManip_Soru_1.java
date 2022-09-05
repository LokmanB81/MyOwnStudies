package denemelerim;

public class StrManip_Soru_1 {
    public static void main(String[] args) {
        /*
String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
Stringini " Java ogrenmek cok guzel." şekline getirin
 */

        String str="Java ogrenmek123 Cok guzel@";
        System.out.println(str);
        str=str.replace(" ","qaz");
        System.out.println(str);

        System.out.println(str.replaceAll("\\W","")
                .replaceAll("\\d","")
                .replace("C","c")
                .replaceAll("qaz"," ")+".");




    }
}
