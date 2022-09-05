package replit;

import java.util.Scanner;

public class Obeb_Okek {
    /*
   Ask user to enter 2 integer then find GCD (Greatest Common Divisor)
    and LCM (Least Common Multiple)
Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1=scan.nextInt();
        System.out.println("Enter second integer ");
        int num2=scan.nextInt();

        int gcd=Gcd(num1,num2);
     //   int okek=Lmc(num1,num2);
        System.out.println("GCD of num1 and num2 = "+gcd);



    }
/*
    public static int okek(int num1, int num2) {
     /*   if (num1>num2){
            int numTemp=num2;
            num2=num1; num1=numTemp;
        int lmcTemp=1;
        for (int i = 1; i <=num2 ; i++) {
            if(num1%i==0 && num2%i==0){
                
            }
        }

        }
        return okekTemp;
    }*/

    public static int Gcd(int num1, int num2) {
        if (num1>num2){
            int numTemp=num2;
            num2=num1; num1=numTemp;
        }

        int gcdTemp=1;
        for (int i = 1; i <=num1 ; i++) {
            if(num1%i==0 && num2%i==0){
                gcdTemp=i;
            }
        } return gcdTemp;
    }

}
