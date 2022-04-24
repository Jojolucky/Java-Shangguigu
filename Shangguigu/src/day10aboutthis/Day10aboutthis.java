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
public class Day10aboutthis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Customer c1 = new Customer("Jojo", "He");
        // 1000 is the customer's id, 2000 is his balance, 0,0123 is the annual interest rate
        Account a1 = new Account(1000, 2000, 0.0123);
        c1.setAccount(a1);
        
        c1.getAccount().deposit(100);
        System.out.println("You have " + c1.getAccount().getBalance());
        
        c1.getAccount().withdraw(900);
        c1.getAccount().withdraw(500);
        
        System.out.println("Customer [ " + c1.getLastName() + "," + c1.getFirstName() + " has " + c1.getAccount().getBalance() + "in her account!");

    }

}
