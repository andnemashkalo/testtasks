package com.it1;

public class Main {
    static int c1=33;

    private static void vertigo_text() {
        System.out.println("Red"); // метод
    }

    /**
     * run function
     */
    public static void main(String[] args) {
        int A = 10;
        int a=22;
        A+=5; //the same as a=a+5
        vertigo_text();
        System.out.println(A);
        System.out.println(++a);
    }
}
