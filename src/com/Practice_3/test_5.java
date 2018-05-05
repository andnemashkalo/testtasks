package com.Practice_3;

public class test_5 {
    public static void main(String[] args){

        for (int k=0; k<101;k++) {
            if (k%2==0){ // если делится на 2 без остатка
            System.out.println("k = " + k);}; // цикл for
        }

     int c=0;
        while (c<=100) { // цикл while выводим четные
            if (c % 2 == 0)
                System.out.println("c=" +c);
            c++;
        }

    }
}
