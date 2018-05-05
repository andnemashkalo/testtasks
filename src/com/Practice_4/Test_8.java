package com.Practice_4;

import java.util.Arrays;

public class Test_8 {
    public static void main(String[] args){ // использование масива масивов
        int [][]a=new int[4][];
        a[0]=new int[]{1,2,3};
        a[1]=new int[]{1,1};
        a[2]=new int[]{2};
        a[3]=new int[] {2,2,2,2,2,2,2,2};
        System.out.println(Arrays.deepToString(a));
    }
}
