package com.Practice_6_OOP.p1;

import com.Practice_6_OOP.A;

public class Main {
    final int cons=7;
    static final int[] constant={1,2,3,4,5}; //не меняется никогда

    public static void main(String[] args) {
        constant[2]=100;
        System.out.println("constant = " + constant[2]);
        c1 a=new c1();
        a.m();
        a=new c2();
        a.m();
        /*c1 c=new c3();
        c.m();*/
  /*      A a=new A(11,22);
        A d=new A(11,22);
        System.out.println(a);
        Class<? extends A> aClass = a.getClass();
        System.out.println(a.getClass() == A.class);
        System.out.println(a.getClass().getSimpleName());
        System.out.println(a.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a.equals(8));
        System.out.println(a.clone());*/
    }
}
