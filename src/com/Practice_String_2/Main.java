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

        System.out.println("qwrwentaretrhtrj".chars()
        .distinct()
        .mapToObj(s->(char)s+"")
        .filter(b)
        .map(a)
        .collect(Collectors.joining("_")));

        System.out.println("cdsbsbebtjyetje".chars().filter(s->(char)s=='e').count()); //подсчет количества буква "e" в слове
        System.out.println("cdsbsbebtjyetje".chars().filter(s->(char)s=='e'||(char)s=='b').count());//подсчет количества буква "e" или "b" в слове

        System.out.println("cdsbsbebtjye45tje".chars().filter(s->(char)s!='4'&&(char)s!='5').mapToObj(s->(char)s+"").collect(Collectors.joining()));// вывести выражение исключив символы 45
    }}
