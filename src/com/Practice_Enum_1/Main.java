package com.Practice_Enum_1;

public class Main {
    public static void main(String[] args) {
        Apple ap;
        /*ap=Apple.RedDel;
        System.out.println("Value of ap: "+ap);
        System.out.println();
        ap=Apple.GoldenDel;
        if(ap==Apple.GoldenDel)
            System.out.println("Ap contains GoldenDel. \n");
        switch (ap){
            case Jonathan:
                System.out.println("Johnatan is red");
                break;
            case GoldenDel:
                System.out.println("GoldenDel is yellow");
                break;
        }
        System.out.println("Here are all Apple constants");
        //values
        Apple allapples[]=Apple.values();
        for (Apple a: allapples)
            System.out.println(a);
        System.out.println();

        ap=Apple.valueOf("Winesap");
        System.out.println("Ap contains "+ap);*/

        Apple ap2, ap3;
        System.out.println("Here are all apple constants "+"and their original values");
        for(Apple a:Apple.values())
            System.out.println(a+" "+a.ordinal());

        ap=Apple.RedDel;
        ap2=Apple.GoldenDel;
        ap3=Apple.RedDel;

        System.out.println();

     /*  Apple a= Apple.C;
        System.out.println(a.s1);*/
     if(ap.compareTo(ap2)<0)
         System.out.println(ap+" comes before "+ap2);
     if(ap.compareTo(ap2)>0)
         System.out.println(ap2+" comes before "+ap);
     if (ap.compareTo(ap3)==0)
         System.out.println(ap+" equals "+ap3);
        System.out.println();
        if ((ap.equals(ap2)))
            System.out.println("Errore! Ahtung");
        if (ap.equals(ap3))
            System.out.println(ap+" equals "+ap3);
        if (ap==ap3)
            System.out.println(ap+"=="+ap3);
    }
}
