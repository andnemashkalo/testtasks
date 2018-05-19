package com.it;

import javax.swing.*;

public class Main {
    static void m(){
        System.out.println("m()");
    }
    static void m(int a){
        System.out.println("m(int a)");
    }
    static void m(int a, int b){
        System.out.println("m(int a, int b)");
    }
    static void m(double a){
        System.out.println("m(double a)");
    }
    static int m(int...a){
        System.out.println("m(int...a)");
        return 1;
    }


    static double avg(int ... a){
        double sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum/a.length;
    }


    public static void main(String[] args){
        m();
        m(11.2);
        m(11,12);
        /*Girl ira = new Girl("Ira", 23);
        Girl ira1=new Girl();
        System.out.println(ira);
        System.out.println(ira.presentGift(new Box_1(41,6,7)));
        *//*Girl ira;
        //System.out.pri sum(ira);
        System.out.println(new Girl());
    new Girl().goToCinema();
        System.out.println("average = " + avg(5,8, 33,11));
        Girl Ket=new Girl("Ket", 23);*//*
        System.out.println(ira.goToRestarant("Mac"));
        ira1=null;
        System.gc();*/
    }

}
class A{}
class B{}

