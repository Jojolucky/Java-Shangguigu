/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day06Array;

import java.util.Scanner;

/**
 *
 * @author jojo
 */
public class Day06array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 从键盘输入学生成绩，找出最高分，并输出学生成绩
        //成绩>=最高分-10 等级为a; >=最高分-20 等级为b， >=最高分-30 等级为c，其余为d
        //先根据学生人数创建数组
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input total number of students: ");
        int number = scan.nextInt();
        
        int[] scores = new int[number];
        System.out.println("Please input " + number + " scores: ");
        for(int i = 0; i < scores.length; i++){
            scores[i] = scan.nextInt();
        }
        int maxScore = 0;
        for(int i = 0; i < scores.length; i++){
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        char level;
        for(int i = 0; i < scores.length; i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("Student " + i + "score is " + scores[i] + ", grade is " + level);
        }
        
    }
}
                
        
       