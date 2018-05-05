package com.Practice_3;

public class Test_4 {
    public static void main(String[] args){

        for (String arg : args) { //множество
            System.out.println(arg);
        }

        int i=1;
        System.out.println("i = " + i);
        while (i<=10) {
            System.out.println(i++);
        }
    }
}
