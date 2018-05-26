package com.Practice_8_OOP;

@FunctionalInterface
public interface IB {
    int a=10;
    void m();
    default void m1(){};
    default void m2(){};
    default void m3(){};
    default void m4(){};

}
