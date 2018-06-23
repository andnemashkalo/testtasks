package com.Practice_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.util.Arrays.asList;

public class Main {
    /*static ArrayList<String> list=new ArrayList<String>(){{
        add("aa");
        add("bb");
        add("cc");
        add("dd");}};*/
    static LinkedList<String> list = new LinkedList<String>(asList("cc","aa","bb"));

    public static void main(String[] args) {
        System.out.println(list);
    }
}
