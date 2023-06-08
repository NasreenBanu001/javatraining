package Exercises.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        int n1=0;
        int n2=1;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit= in.nextInt();
        System.out.println("The Fibonacci series of " +limit +"is :");
        System.out.println(n1);
        System.out.println(n2);
        for (int i=1;i<=limit;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
