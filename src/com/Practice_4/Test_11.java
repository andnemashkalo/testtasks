package com.Practice_4;

import java.util.Arrays;

public class Test_11 {
    public static void main(String[] args) {//поиск элемента в массиве
        int[]arr={10,20,30,40};
        int pos = Arrays.binarySearch(arr, 30);
        System.out.println("pos = " + pos);

        int[] arr0={1,2,3,4,5,6};//переписать один масив в другой
        int[] arr1={0,0,0,0,0,0,0,0};
        System.out.println("arr0 = " + Arrays.toString(arr0));
        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.arraycopy(arr0,1,arr1,2,3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
            }

}
