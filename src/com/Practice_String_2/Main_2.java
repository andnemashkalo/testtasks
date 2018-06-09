package com.Practice_String_2;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_2 {
    public static void main(String[] args) {
/*        Random random=new Random();
        random.ints(1,100)
                .limit(10)
                .forEach(s->System.out.println(s));*/

        Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s->s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":"));

        Pattern pattern=
                Pattern.compile(".*@gmail\\.com");
        System.out.print(Stream.of("bob@gmail.com", "alice@hotmail.com", "bonnie@gmail.com")
                .filter(pattern.asPredicate())
                .count());

    }
}
