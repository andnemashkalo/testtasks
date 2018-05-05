package Homework.Task_1;

import java.util.Scanner;

public class case_1_5 {
    public static void main(String[] args){
        System.out.print("Enter your numbers: \n" );
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print("a = " + a);
        System.out.println("b = " + b);

        System.out.println("sum = " + (a+b));
        System.out.println("Multiply = " + a*b);

    }
}
