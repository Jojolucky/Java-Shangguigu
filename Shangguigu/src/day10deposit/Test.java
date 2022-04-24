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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank();
        bank.addCustomer("Jojo", "He");
        
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println("Your balance is " + bank.getCustomer(0).getAccount().getBalance());
        
        
    }
    
}
