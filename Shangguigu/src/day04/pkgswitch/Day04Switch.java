/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author jojo
 */
public class Day04Switch {

    /**
     * 
     * @param args the command line arguments
     */
    //凡是可以用 switch case 的结构，都可以转换成if-else ，反之不成立
    //如果发现都可以用的情况下，优先使用switch case写（switch case 的表达式不太多的情况下）
    public static void main(String[] args) {
        // TODO code application logic here

        /*      int number = (int)(Math.random()*5); 
        //random will create a number between 0-1, so *5 can make the number larger.
        switch(number){
            case 0:
                System.out.println("The number is: " + number);
                break;
            case 1:
                System.out.println("The number is: " + number);
                break;
            case 2:
                System.out.println("The number is: " + number);
                break;
            case 3:
                System.out.println("The number is: " + number);
                break;
            case 5:
                System.out.println("The number is: " + number);
                break;
            default:
                System.out.println("It is not a number! ");
            
                
        }
         */
        //**编写程序： 从键盘上输入2019年的month和day， 要求同父哦程序输入输出的日期为2019第几天
        // break  在switch-case中 不是一定需要写的。
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the Month of 2019: ");
        int month = scan.nextInt();
        System.out.println("Please input the Day of 2019: ");
        int day = scan.nextInt();

        int sumDay = 0;
        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                sumDay += 28;
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
        }
        System.out.println("The date of " + month +" "+ day + "in 2019 is No." + sumDay +"day.");
                
    }

}
