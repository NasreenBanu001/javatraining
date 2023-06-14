package Exercises.AscendingOrder;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int temp;
        int a[]={10,9,5,7,12,34,56};
        System.out.println("Array before swap:");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Array After swap:");
        System.out.println(Arrays.toString(a));
    }
}
