package basic.Jagged_Array;

public class Jagged_Array {
    public static void main(String[] args) {
        int a[][]={
                {10,20},
                {30,40,50},
                {60,70,80,90}
        };
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("with enhanced for loop:");
        int b[][]={
                {10,20,30,40},
                {30,40,50},
                {60,70,80,90}
        };
        for (int n[]:b) {
            for (int l:n) {
                System.out.print(" "+l);
            }
            System.out.println(" ");
        }
        System.out.println("Small topic of ASCII character");
        for (int i = 0; i < 255; i++) {
            System.out.println(i +" "+(char)i);
            
        }
    }
}
