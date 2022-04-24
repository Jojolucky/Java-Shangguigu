/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10aboutthis;

/**
 *
 * @author jojo
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        
    }
    
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(int annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Your balance is not enough!");
            return;
        }
        balance -= amount;
        System.out.println("You have withdraw " + amount);
        
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("You have saved " + amount);
        }
    }
    
   
}
