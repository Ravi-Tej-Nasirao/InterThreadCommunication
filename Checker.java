package com.interview;/*
 * @author : Ravi Tej Nasirao
 */

public class Checker {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                bank.withdraw(15000);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                bank.deposit(15000);
            }
        };


        t1.start();
        t2.start();


    }
}
