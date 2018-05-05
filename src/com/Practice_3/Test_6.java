package com.Practice_3;

public class Test_6 {
    public static void main(String[] args){
       String strInt="123"; String strDouble="123.45";
       int x; double y;
       x = Integer.parseInt(strInt);
       y=Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        strInt = String.valueOf(x+1);
        strDouble=String.valueOf(y+1);
        System.out.println("strInt = " + strInt);
        System.out.println("strDouble = " + strDouble);
        String str;
        str ="num " +345;
        System.out.println("str = " + str);

        System.out.println(Integer.toString(262));
        System.out.println( Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));
    }
}