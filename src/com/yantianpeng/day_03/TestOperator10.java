package com.yantianpeng.day_03;

import java.util.Scanner;

/**
 *
 */
public class TestOperator10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//获取键盘的操作。
        System.out.print("请输入您的用户名:");//给出提示
        String userName = scanner.nextLine();//获取输入的一行，返回的是字符串类型
        System.out.print("请输入你的薪水:");
        double salary = scanner.nextDouble();//返回的是double类型的变量
        System.out.print("请输入你的工作时间:");//返回的是int 类型的变量
        int year = scanner.nextInt();

        System.out.println("用户名是:"+userName+"你的总工资是:"+(salary*year));


    }
}
