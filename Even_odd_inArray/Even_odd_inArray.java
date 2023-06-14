package Exercises.Even_odd_inArray;

import java.util.Scanner;

public class Even_odd_inArray {
    public static void main(String[] args) {
        int even=0,odd=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter te limit of array:");
         int n= in.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             System.out.println("Enter the vales of array");
             arr[i]= in.nextInt();
         }
        System.out.print("the array is:" );

        for (int i=0;i< arr.length;i++){
             System.out.println(arr[i] +" ");
    }
        for (int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total number of even number is an array:" +even);
        System.out.println("Total number of even number is an array:" +odd);

    }
}
