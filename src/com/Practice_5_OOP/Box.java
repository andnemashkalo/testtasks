package com.Practice_5_OOP;

public class Box{
    double width, height, depth;


void volume() {// метод
    System.out.print("Volume is = ");
    System.out.println(width * height * depth);
}
double volume1(){
    return width*depth*height;
}
    public Box(double d,double h, double w){
        width=w;
        height=h;
        depth=d;
    }

}
class BoxDemo {
    public static void main(String args[]) {
       /* Box mybox=new Box();
        Box mybox1=new Box();
        Box mybox2=new Box();*/
        double vol;
      /*  mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        mybox1.width=16;
        mybox1.height=33;
        mybox1.depth=67;
        mybox2.width=6;
        mybox2.height=66;
        mybox2.depth=666;*/


        Box mybox3=new Box(5,7,2);
        mybox3.volume();

        /*vol=mybox.width*mybox.height*mybox.depth;
        System.out.println("vol 1 is= " + vol);
        mybox1.volume();// вызов метода

        System.out.println("vol2 = " + mybox2.volume1());// вызов метода типа переменной
        //or
        vol = mybox2.volume1();
        System.out.println("vol2 = " + vol);*/

    }
}
