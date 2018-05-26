package com.Practice_8_OOP;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    /*public static void main(String[] args) {
        A a=new A();
        a.m();
        IA a1 = new A();
        a1.m();
        IA.m1();
        IA.s[0]=88;
        System.out.println(Arrays.toString(IA.s));
        a1.m3();
    }*/
    public static void main(String[] args) {
        IA a=new A();
       /* a=()-> System.out.println()*/

        a.m();
        IB f=()-> System.out.println("Main1");
        f.m();
        f=()-> System.out.println("Main2");
        f.m();
        f=()-> System.out.println("Main3");
        f.m();

    }
}
