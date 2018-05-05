package Homework.Task_2;


import java.util.Arrays;

public class case_2_1 {
    public static void main(String[] args) {
        int a[]={11,22,14,61,83,9,1}; // короткое и самое длинное число
        int max=0, min=999;
        int max_l=Integer.toString(Integer.MAX_VALUE).length();
        for (int i=0;i<a.length;i++){
            int is=Integer.toString(i).length();
            if (a[i] > max) {
                max=a[i];
                max_l=is;
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i] < min) {
                min=a[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("max length = " + max_l);
        System.out.println("min = " + min);

    }
}
