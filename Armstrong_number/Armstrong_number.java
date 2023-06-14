package Exercises.Armstrong_number;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong_number {

    public static void main(String args[]){
        int value=1;
        Scanner in=new Scanner(System.in);
        int rem, i=0;
        int sum =0;
        System.out.println("Enter the the number to check Armstrong:");
        String number= in.next();
        int l= number.length();
        int check=l;

        while (i<l){
            char cha = number.charAt(i);

            int num =Integer.parseInt(String.valueOf(cha));
            for(int j=0;j<l;j++)
            {

                value =value*num;
                System.out.println(value);
            }

                    i++;

        sum= sum+value;
            value=1;
        }
        if(sum==check){
            System.out.println(check +"is a Armstrong number");
        }
        else{
            System.out.println(check +"is not a Armstrong number");

        }



//        Scanner in=new Scanner(System.in);
//        int rem, power;
//        int sum =0;
//        System.out.println("Enter the the number to check Armstrong:");
//        String number= in.next();
//        int l= number.length();
//        int num= Integer.parseInt(String.valueOf(number));
//        while (l>0){
//            rem=num%10;
//            power = Math.pow(rem, l);
//            sum=sum+ power;
//            System.out.println("The armstrong num is:"+sum);
//        }

    }
}
