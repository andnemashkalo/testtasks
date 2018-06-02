package com.Practice_String_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(Arrays.toString("100 ml".trim().split("\\s")));
        System.out.println("100 ml".trim().split("\\s+")[0]);
        System.out.println((100+"").equals("100 ml".trim().split("\\s+")[0]));*/

        int i=Integer.parseInt("100");
        System.out.println(i+10);
        Integer integer=new Integer("100");
        System.out.println(integer+20);

        char chars[]={'a','b','c','d','e','f'};
        String s=new String(chars,2,3);
        System.out.println(s);

        System.out.println("wtewwet,whwhwh,whewhwh,ewhwhw,ehehe".chars().filter(f -> f==',').count());
    }
}
