package Java_Test.Math_Problem;

import java.util.Scanner;


public class Math_Problem {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x=in.nextDouble();
        System.out.println("Enter the value of y: ");
        double y=in.nextDouble();
        System.out.println("Enter the value of z: ");
        double z=in.nextDouble();
       double ex= Math.pow(x,2)+Math.pow(x,2)-Math.abs(z);
       float expression = (float) Math.cbrt(ex);
        System.out.println("The Answer of the expression Cube root of (x^2+y^2-|z|) = " +expression);
    }
}
