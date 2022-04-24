package day08ood;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jojo
 */
/*
    创建一个studen类，三个属性 number（int），state(int),score(in)
    创建20个学生对象，学好1-20，年纪和成绩随机生成
    打印所有2年级学员，number，state，score，遍历所有学生的信息
    使用冒泡
 */
public class Day08ood {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Student[] student = new Student[20];
        for (int i = 0; i < 20; i++) {
            student[i] = new Student(); //对数组中每一个元素new一个学生对象
            student[i].number = (i + 1);  // 给每个学生编号
            student[i].state = (int) (Math.random() * (6 - 1 + 1) + 1); //1-6年级
            student[i].score = (int) (Math.random() * (100 - 0 + 1)); //0-100分
        }
        System.out.println("*****This is the list of all students*****");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Student ID: " + student[i].number + "   Student state: "
                    + student[i].state + "   Student score: " + student[i].score);
        }
        System.out.println("\n");
        //2年级学员
        System.out.println("*****This is the list of all students of No.2 state*****");
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == 2) {
                System.out.println("Student ID: " + student[i].number + "   Student state: "
                        + student[i].state + "   Student score: " + student[i].score);
            }
        }
        System.out.println("\n");

        //冒泡排序
        System.out.println("*****This is the sorted list of all students*****");
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student.length - 1 - i; j++) {
                if (student[j].score > student[j + 1].score) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < student.length; i++) {
            System.out.println("Student ID: " + student[i].number + "   Student state: "
                    + student[i].state + "   Student score: " + student[i].score);
        }

    }

}

class Student {

    int number;  //学号
    int state;  //年级
    int score;  //成绩
}
