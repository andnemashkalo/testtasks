package com.Practice_8_OOP;

public interface IA extends IB,IC {
    int a=10;
    int [] s={1,2,3};
    void m2();
    default  void m3(){
        System.out.println("Hi from interface");
    }

}
