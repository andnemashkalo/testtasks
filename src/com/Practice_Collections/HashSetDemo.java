package com.Practice_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs=new LinkedHashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

       /* hs.forEach(s-> System.out.println(s.hashCode()));*/ //вывести в хэшкоде

        for (String x:hs) {
            System.out.print(x.hashCode()+" ");

        }

        Set<Girl> hd=new TreeSet<>((s1,s2)->s2.name.compareTo((s1.name)));
        hd.add(new Girl("Ira", 34));
        hd.add(new Girl("Lena", 24));
        hd.add(new Girl("Anja", 20));
        hd.add(new Girl("Kate", 17));

    }
}
