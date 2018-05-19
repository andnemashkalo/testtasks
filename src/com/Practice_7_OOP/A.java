package com.Practice_7_OOP;

public class A {
    int a;
    static int b;
    static{
        System.out.println("static");

    }
    {
        System.out.println("not static");
    }
    void m(){
        System.out.println("not static");

    }static void m1(){
        System.out.println("static");
    }


}
