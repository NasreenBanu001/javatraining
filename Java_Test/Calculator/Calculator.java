package Java_Test.Calculator;

import java.util.Scanner;

public class Calculator {

    private double a ,  b;
    public Calculator(double num1, double num2){
        a = num1;
        b = num2;

    }
    public void add(){
        int add = ((int)a + (int)b);
        System.out.println(add);
    }
    public void subtract(){
        if(a>b){
            int sub = ((int)a - (int)b);
            System.out.println(sub);
        }
        else{
            int sub = ((int)b- (int)a);
            System.out.println(sub);
        }
    }
    public void multiply(){
        int mul = ((int)a * (int)b);
        System.out.println(mul);
    }
    public void divide(){
        if(a>b){
            double div=  a/b;
//            int div = ((int)a /(int)b);
            System.out.println(div);
        }
        else{
            double div=  b/a;
//            int div = ((int)b /(int)a);
            System.out.println(div);
        }
    }

    public static void main(String args[]){

        Calculator obj= new Calculator(10,94);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
