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
public class Day05For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*    
        //求12和20的最大公约数，最小公倍数
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first integer:");
        int m = scan.nextInt();
        System.out.println("Please input the second integer:");
        int n = scan.nextInt();

        int min = (m <= n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("GCD is: " + i);
                break;
            }
        }
        int max = (m >= n) ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("LCM is: " + i);
                break;
            }
        }
         */
 /*    
        
        // while  do-while  while-true
        //循环结构的四个要素
        // 1。 初始化条件 。2。 循环条件。 3。循环体。4。 迭代条件
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        
        while (true) {//当不知道需要多少次的时候，在里面写上一个永远为true的表达式即可
            System.out.println("Please input number:");
            int number = scan.nextInt();

            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                break;
            }
        }
        System.out.println("The total positive number is: " + positiveNumber);
        System.out.println("The total negative number is: " + negativeNumber);
         */
 /*
 
        // 九九乘法表
        // 1*1=1
        // 2*1=2 2*2=4
        //*****
        // 9*1=9 ………… 9*9=81
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");

            }
            System.out.println();

        }

       
 */
 
 
        //输入100以内所有的质数
        //只能被1和数字本身整除的数字为质数
      
        
        boolean isFlag = true; //标志i是否被j除尽，一旦除尽，就更改为false
        for (int i = 2; i <= 100; i++) { //遍历100以内所有的自然数
            for (int j = 2; j < i; j++) { // j被i去除
                if (i % j == 0) {
                    isFlag = false;  // i被j除尽，说明i不是一个质数
                    break;  //优化：对非质数有效，加了break之后，程序性能会提升很多，因为不会再计算后面的了
                }
            }
            if (isFlag == true) { // 如果说没有被除尽说明flag没有被修改，还是为true，则输出
                System.out.println(i);
            }
            isFlag = true;  //重置Flag，不然的话，flag被改成了false之后，就一直是false了
        }

        System.out.println("second method");
        // label 的使用， 如果不使用label的话，break和continue都是默认作用于最近包裹的那一层循环

        int count = 0;
        label:for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }
        System.out.println("there are " + count + " prime numbers! ");

    }

}
