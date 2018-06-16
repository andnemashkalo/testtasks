package com.Practice_Generics;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        Stats<Integer> iob=new Stats<Integer>(inums);
        double v=iob.average();
        System.out.println("iob average is: "+v);

        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob=new Stats<Double>(dnums);
        double w=dob.average();
        System.out.println("dob average is: "+w);
        /*String strs[]={"1","2","3","4","5"};*/

        System.out.print("Averages of iob and dob are: ");
        if (iob.sameAvg(dob))
            System.out.println("the same");
        else
            System.out.println("differ.");
    }
}
