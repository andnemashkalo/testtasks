package com.Practice_2;

public class Test_1 {
    public static void main(String[] args){
        char c1='1';
        char c2='\u0031';
        char c3=49;
        System.out.println(c1+c2+c3);
        System.out.println();

        char ch1,ch2;
        ch1=88; // code for X
        ch2='Y';
        System.out.println("ch1 and ch2:");
        System.out.println(ch1+ "" +ch2);

        for(int i='a'; i<='z'; i++){
            System.out.println("i = " + (char)i);
        }

    }
}
