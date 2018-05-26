package com.Practice_9_OOP;

public class Main {

    public static void main(String[] args) {
        class D{


            public int a;
            int b;

            public D(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public String toString() {
                return "D{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }
        }

    }
}
