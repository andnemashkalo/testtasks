package com.Practice_7_OOP;

public class B extends A{
    static int b=100;
    {
        System.out.println("not static");
    }
    @Override
    void m(){
        System.out.println("B");
    }

}
