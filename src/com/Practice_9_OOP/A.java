package com.Practice_9_OOP;

public class A {
    int a;
    class B{
        int b;

        public B(int b) {
            this.b = b;
        }
        public void m(){
            System.out.println("Class B"+b);
        }
    }
    static class C{
        int c;

        public C(int c) {
            this.c = c;
        }
        public void m(){
            System.out.println("Class C"+c);
        }
    }
    public A(int a){
        this.a=a;
    }
    public void m(){
        System.out.println("Class A"+a);
    }
}
