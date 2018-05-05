package com.Practice_2;

public class Test_2 {
    public static void main(String[] args){
        byte a=50;
        byte b=99;
        short c= (short) (a+b);
        short d=(byte)(a+b);
        System.out.println(c);
        System.out.println(d);
        byte b1=50, b2=-99;
        b1+=b2;
        System.out.println("b1="+b1);
    }
}
