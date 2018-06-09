package com.Practice_String_1;

public class RegionMatchesExample {
    public static void main(String[] args) {
        String str1=new String("Hello, How are you");
        String str2=new String("How");
        String str3=new String("HOW");

        System.out.println("Result of Test1: ");
        System.out.println(str1.regionMatches(7,str2,0,3));
        System.out.println("Result of Test2: ");
        System.out.println(str1.regionMatches(7,str3,0,3));
        System.out.println("Result of Test3: ");
        System.out.println(str1.regionMatches(7,str3,0,3));

        String str=new String("quick brown fox jumps over the lazy dog");
        System.out.println("Substring starting from index 15:");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20: ");
        System.out.println(str.substring(15,20));


        String t="Now is the time for all good men "+"to come to the aid of their country.";
        System.out.println(t);
        System.out.println("IndexOf(w)="+t.indexOf('w'));
        System.out.println("LastIndexOf(d)="+t.lastIndexOf('d'));

        int i= Integer.parseInt("kitty123".replaceAll("[\\D]",""));
        System.out.println(i);
    }
}
