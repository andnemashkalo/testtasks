package Homework.Task_1;

import java.util.Scanner;

public class case_1_1 { //Приветствовать любого пользователя при вводе его имени через командную строку
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How r u?");
    }
}
