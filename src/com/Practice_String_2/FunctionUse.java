package com.Practice_String_2;

import java.util.Arrays;

public class FunctionUse {
    public static void main(String[] args) {
        /*Arrays.stream("4,-9,16".split(","))
                .map(Integer::parseInt)
                .map(i->(i<0)?-i:i)
                .forEach(System.out::println);*/

        Arrays.stream("1,2,3,4,5,6,7,8,9".split(",")) //вывести четные и умножить на 2
                .map(Integer::parseInt)
                .filter(s->s%2==0)
                .map(s->s*2)
                .forEach(System.out::println);
    }
}