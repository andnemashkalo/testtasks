package com.Practice_9_OOP;

public class Main {

    public static void main(String[] args) {
      /*  class D{


            public int a;
            int b;

            public D(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public String toString() {
                return "D{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }
        }
        D d =new D(2,3);
        System.out.println(d);*/
     /* A a = new A(1);
      a.m();
      A.C b=new A.C(2);
      b.m();
      A.B c=a. new B(2);
      c.m();*/

     /* Bank a1= new Bank("Private");
      Bank.Account account=a1.new Account(123,100);
      account.show();
      Bank a2= new Bank("PUMB");
      Bank.Account account1=a2.new Account(124,150);
      account1.show();*/

      E e=new E();

      e.m();
      new E() {
          @Override
          void m() {
              System.out.println("B");
          }
          void n(){
              System.out.println("n");
          }
      }.n();


    }
}
