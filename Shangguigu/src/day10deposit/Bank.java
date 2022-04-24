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
public class Bank {
    private Customer[] customers; //存放多个客户的数组
    private int numberOfCustomers; // 记录客户的数量
    
    public Bank(){
        customers = new Customer[10];
    }
    
    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
        
    }
    public int gerNumberOfCustomers(){
        return numberOfCustomers;
        
    }
    
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
    
   
    
}
