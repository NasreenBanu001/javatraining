package Exercises.Reverse_Of_Number;

import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String args[]){
        int rev=0, rem;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to be reverse:");
        int num =in.nextInt();
        int temp=num;
        while (num!=0){
            rem=num%10;
            rev= (rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of "+temp +"is :" +rev);

    }
}
