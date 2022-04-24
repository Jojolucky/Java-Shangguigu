/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07bubblesort;

/**
 *
 * @author jojo
 */
public class Day07bubblesort {

    /**
     * @param args the command line arguments
     */
    // 数组的冒泡排序:
    // 比较相邻两个数字的大小，把小的往前放。 n个数字，则需要比较n-1轮
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = new int[]{43,23,34,23,-20,34,22,333,100};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
        }
       
        
    }
    
}
