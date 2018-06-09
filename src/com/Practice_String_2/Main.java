package com.Practice_String_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>(Arrays.asList("Z","A","K"));
        /*strings.stream().filter(s->s.equals("A")).findFirst().get().indexOf();*/

        Function<String,String>a=s->s+"aaa";
        /*System.out.println(new StringBuffer("qwertyui").reverse());*/


        System.out.println(a.apply("qqq"));
        Predicate<String> b= s->s.equals("q")||s.equals("r")||s.equals("t");
        System.out.println(b.test("q"));

        System.out.println("qwrwetrhtrj".chars()
        .distinct()
        .mapToObj(s->(char)s+"")
        .filter(b)
        .map(a)
        .collect(Collectors.joining("-")));


    }}
