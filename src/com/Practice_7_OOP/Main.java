package com.Practice_7_OOP;

public class Main {

    public static void main (String[] args){
        Shape s[]=new Shape[3];
        s[0]=new Circle("Black",10,5,10);
        s[1]=new Rectangle("Yellow", 10,10,50,50);
        s[2]=new Circle("Green", 10,10,5);
        for (int i=0;i<s.length;i++)
            System.out.println(s[i].draw());

        /*System.out.println(A.b);*/
      /*  A a=new A();
 *//*       B.m1();
        System.out.println(B.b);*//*
        B b=new B();
        A a1=new A();*/


        /*Ball sd=new Ball("red");
        System.out.println(sd);
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.count);*/
    }

}
