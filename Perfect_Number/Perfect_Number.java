package Exercises.Perfect_Number;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number to check whether it is a perfect number not not:");
        int num=in.nextInt();
        int temp= num;
        for (int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");

        }
    }
}
