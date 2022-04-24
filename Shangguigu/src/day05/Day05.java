/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05;

import java.util.Scanner;

/**
 *
 * @author jojo
 */
public class Day05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // step 1: import package;
        //step 2: scanner 的实例化；
        // step 3: 调用scanner类中对应的方法
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please input your name: ");
        String name = input.next();
        System.out.println("Your name: " + name);
        
        System.out.println("Please input your age: ");
        int age = input.nextInt();
        System.out.println("Your age: " + age);
        
        System.out.println("Please input your gender: ");
        boolean isFemale = input.nextBoolean();
        System.out.println("Are you Female: " + isFemale);
        
        System.out.println("Please input your weight: ");
        double weight = input.nextDouble();
        System.out.println("Your weight: " + weight);
        
        
        //对于char类型，scanner没有对应的方法，可以通过一下方式进行
        
        System.out.println("Please input your name: ");
        String name1 = input.next();
        char nameChar = name1.charAt(0);
        System.out.println("Your nameChar: " + nameChar);
        
        
    }
    
}
