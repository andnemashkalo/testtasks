package com.Practice_String_2;

import java.util.Date;
import java.util.Locale;

public class Main_3 {
    public static void main(String[] args) {
        /*        System.out.println(Locale.getDefault());
        System.out.println(new Date());
        Locale.setDefault(Locale.FRANCE);
        System.out.println(Locale.getDefault());
        System.out.println(new Date());*/
        Locale current= Locale.getDefault();
        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());
    }
}
