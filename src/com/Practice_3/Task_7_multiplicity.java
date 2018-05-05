package com.Practice_3;

import java.util.Arrays;

public class Task_7_multiplicity {
    public static void main(String[] args){

       int sum=0;
       int nums[][]=new int[3][5];
       for (int i=0; i<3; i++){
           for (int j=0; j<5; j++)
               nums[i][j]=(i+1)*(j+1);
           }
        for (int x[]:nums){
           int sum1=0;
        for (int y:x){
            System.out.println("Value is " + y);
        sum+=y;
        sum1+=y;}
            System.out.println("sum1 = " + sum1);

        System.out.println("summation = " + sum);}


      /*int[]a={1,2,3,4,5,6,7,8};// задать множество
        int[]a1=new int[5];// выделена память под путой масив на 5 ячеек

       for (int i=0; i<a.length;i++){ // вывод массива циклом for
        System.out.println(a[i]);}

        for (int i : a) { //вывод массива циклом for each
            System.out.println(i);
        }

        System.out.println(Arrays.toString(a)); // вывод массива в ряд
        Arrays.stream(a).forEach(System.out::println);
        System.out.println(a1);*/

       /* int [][]b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; // объявление множества множемтв (матрица)
        System.out.println(Arrays.deepToString(b));*/
    }
}