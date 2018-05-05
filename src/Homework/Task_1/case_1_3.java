package Homework.Task_1;

import java.util.Random;
import java.util.Scanner;

public class case_1_3 {
    public  static void main(String[] args){
        int x[]={3,5,9,24,66,46,99};
        System.out.println("С переходом");
        for (int a:x){
            System.out.println(a);
        }
        System.out.println("Без перехода");
        for (int b:x){
            System.out.print(" "+b);
        }
    }
}
