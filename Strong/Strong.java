package Exercises.Strong;

import java.util.Scanner;

public class Strong {
    public static void main(String args[]){
        int fact, rem;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        while(num>0)
        {
            rem=num%10;
            fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;

            }
            System.out.println("fact: "+fact);
            num=num/10;
        }
    }
}
