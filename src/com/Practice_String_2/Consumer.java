package com.Practice_String_2;

public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<String> printUpperCase= str->
                System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
     }
}
