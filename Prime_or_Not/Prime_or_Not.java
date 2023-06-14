package Exercises.Prime_or_Not;

import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int flag=0;
        System.out.println("Ether the number:");
        int num= in.nextInt();
        for (int i=1;i<=num;i++){
            if(num%i==0){
                flag++;
            }
        }
        if (flag<=2)
        {System.out.println(num+" is a prime number");
        }
        else
            {System.out.println(num+" is a not prime number");

            }
    }}
