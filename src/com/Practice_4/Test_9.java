package com.Practice_4;

import java.util.Arrays;

public class Test_9 {
    public static void main(String[] args){// поменять местами значения в масиве в обратный порядок
        int[]a={1,2,3,4,5,6,7,8};
        int[]b={8,9,10,11,12,13,14,15};
        inversion(a);
        inversion(b);

    }

    private static void inversion(int[] a) {// метод
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-1-i];//выбор последней ячейки и присвоить его число текущему элементу
            a[a.length-1-i]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
