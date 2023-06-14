package Exercises.Armstrong_with_limit;

import java.util.Scanner;

public class Armstrong_with_limit {
    public static void main(String args[]){
        int temp, digit1,digit2, digit3, result;
        Scanner in=new Scanner(System.in);
        System.out.println(("Armstrong number for 3 digit number"));
        System.out.println("Enter the starting limit:");
        int s_limit = in.nextInt();
        System.out.println("Enter the ending limit:");
        int e_limit =in.nextInt();
        for (int i=s_limit; i<=e_limit;i++){
            temp=i;
            digit3=temp%10;
            temp=temp/10;
            digit2=temp%10;
            temp=temp/10;
            digit1=temp%10;
            result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

            if( i==result){
                System.out.println(i+"is an armstrong number");
            }


        }



    }
}
