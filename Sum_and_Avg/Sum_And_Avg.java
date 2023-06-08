package Exercises.Sum_and_Avg;

import java.util.Scanner;

public class Sum_And_Avg {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the limit");
        int sum=0;
        int limit= in.nextInt();
        for (int i=1;i<=limit;i++){
            System.out.println("Enter te number "+i +":");
            int n= in.nextInt();
            sum+=n;
        }
        int avg=sum/limit;
        System.out.println("The sum of the given is: "+sum);
        System.out.println("The average of the given is: "+avg);

    }
}
