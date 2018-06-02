package com.Practice_9_OOP;

public class Bank {

    String title;
    public Bank(String title) {
        this.title = title;
    }


    class  Account {
        int number;
        double balance;

        public Account(int number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        void setMoney(double money) {
            if (money > 0) {
                balance += money;
            }}
            void getMoney (double money) {
            if (money<balance){
                balance=money;
        }
        }
        void show(){
            System.out.printf("Bank -%s, account number - %d, balance - %g\n",title, number, balance);
        }
    }

}
