package Homework.Task_1;

import java.util.Scanner;

public class case_1_4 {
    public static void main(String[] args){
        System.out.println("Password:");
        Scanner s=new Scanner(System.in);
        String p="test1";
        String ent=s.next();
        if (ent.equals(p)){
            System.out.println(" The password is correct ");
        }
        else System.out.println("The password is wrong");
    }

}