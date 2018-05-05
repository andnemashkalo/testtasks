package com.Practice_2;

import java.io.IOException;
import java.util.Scanner;

public class task_0 {
    public static void main(String[] args) throws IOException {

        Scanner scan=new Scanner(System.in);
        int age = scan.nextInt();
        String activity;
        System.out.println("age = " + age);

        if((age>=3)&&(age<=6))
            activity="Kindergarten";
        else if((age>=7)&&(age<=17)){activity="School";}
        else if((age>=18)&&(age<=23)){activity="University";}
        else if((age>=24)&&(age<=60)){activity="Job";}
        else if((age>=61)&&(age<=90)){activity="Retire";}
        else activity="Dead";
        System.out.println("activity = " + activity +".");

    }
}

