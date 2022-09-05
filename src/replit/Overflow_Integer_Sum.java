package replit;

import java.util.Scanner;

public class Overflow_Integer_Sum {
    public static void main(String[] args) {
       /* Write a Java program to compute and print sum of two given numbers (more than or equal to zero).

       If given integers or the sum have more than 10 digits, print "overflow".

                EXAMPLE:
        INPUT :
        Input two integers:
        25
        46
        OUTPUT :
        Sum of the numbers: 71   */
        int  num1; int num2; int sum;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1. number 'max 9 digits'");
        num1= scan.nextInt();
        System.out.println("enter 2. number 'max 9 digits'");
        num2=scan.nextInt();

        if (num1>=999999999 || num2>=999999999 ){

            System.out.println("Overflow");

        } else  {
            sum=num1+num2;
                if(sum>999999999){
                    System.out.println("Overflow");
                }
                else {
                    System.out.println("Sum of two numbers = "+sum);
                }

        }

    }
}
