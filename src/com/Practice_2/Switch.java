package com.Practice_2;

public class Switch {
    public static void main(String[] args){
        int d=9;
        switch (d){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday " + d);
                break;
            case 6:
            case 7:
                System.out.println("Weekend " + d);
                break;
                default:
                    System.out.println("Hola!");
        }
    }
}
