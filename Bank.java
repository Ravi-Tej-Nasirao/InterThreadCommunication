package com.interview;/*
 * @author : Ravi Tej Nasirao
 */

public class Bank {

    private int balance = 10000;

    public void withdraw(int amount) {
        System.out.println("Getting amount from bank account.");
        synchronized (this){
            if(amount > balance){
                System.out.println("Wait for deposit");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            balance = balance - amount;
        }
    }

    public void deposit(int amount){
        System.out.println("Depositing amount to bank account.");
        synchronized (this){
            balance = balance + amount;
            notify();
        }
        System.out.println("Depositing amount complete to bank account.");

    }
}
