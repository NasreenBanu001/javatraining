package basic.Getting_inputs;

import java.util.Scanner;

public class Getting_Inputs {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a= in.nextInt();
        float b = in.nextFloat();
        float c= (a*a)+(b*b)+(2*a*b);
        System.out.println("a^2+b^2+2ab = "+c);
    }
}
