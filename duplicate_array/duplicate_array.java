package Exercises.duplicate_array;

import java.util.Arrays;

public class duplicate_array {
    public static void main(String[] args) {
        int dup=0;
        int a[] = {2,4,6,2,4,7,6,8,7,9,5};
        System.out.println("The array:" + Arrays.toString(a));
        System.out.println("The duplicate values are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j] && (i !=j)){
                    System.out.println(a[j]);

                }
            }
        }
    }
}
