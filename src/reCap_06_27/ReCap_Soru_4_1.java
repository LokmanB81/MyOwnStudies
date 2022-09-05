package reCap_06_27;

import java.util.Scanner;

public class ReCap_Soru_4_1 {
    public static void main(String[] args) {
       /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("unvaninizi giriniz");
        String jobTitle= scan.nextLine().toLowerCase();

        switch (jobTitle) {
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("gecerli ifade giriniz");

        }
    }
}
