package com.Practice_4;

import java.util.Arrays;

public class Test_10 {

    public static void main(String[] args) {//сортировка от большего к меньшему
        /*int[] b = {8, 5, 11, 9, 22, 13, 4, 5};
        int[] c = {8, 66, 11, 9, 22, 13, 15, 95, 39,88,12,37};
        Sorting(b);
        Sorting(c);*/
        int matrix[][]=new int[4][];
        matrix[0]=new int[1];
        matrix[1]=new int[2];
        matrix[2]=new int[3];
        matrix[3]=new int[4];
        matrix_out(matrix);


    }

    private static void matrix_out(int[][] matrix) {
        int s, d, k=0;
        for (s=0;s<4;s++){
            for (d=0;d<s+1;d++){
            matrix[s][d]=k;
            k++;
            }}
        for (s=0;s<4;s++){
        for(d=0;d<s+1;d++){
            System.out.print(matrix[s][d] +" ");}
            System.out.println();
        }
    }

    private static void Sorting(int[] b) {
        System.out.println(Arrays.toString(b));
        for (int i = b.length-1; i>=0; i--) {
            for (int j=0;j<i;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }

        }
        System.out.println("Sorted: "+Arrays.toString(b));
    }
}