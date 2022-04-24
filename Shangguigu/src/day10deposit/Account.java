/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10deposit;

/**
 *
 * @author jojo
 */
public class Account {
    private double balance;
    
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("Money saved Succesfully");
        }
    }
    
    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("withdraw operation Succesfully!");
        }else{
            System.out.println("Balance is not enough!");
        }
    }
}
