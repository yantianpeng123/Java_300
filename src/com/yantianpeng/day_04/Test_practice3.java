package com.yantianpeng.day_04;

import java.util.Scanner;

/**
 * 作业
 */
public class Test_practice3 {
    public static void main(String[] args) {

        //薪水计算器:通过键盘输入用户的月薪，每年是几个月的薪水，输出用户的年薪，
        // 直到键盘输入exit,则这个退出程序，输入中途，键盘输入next,则这个用户退出计算，算下一个用户的年薪
        System.out.println("年薪计算器小软件");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户的月薪");
            int monthSalary  = scanner.nextInt();
            System.out.println("请输入用户是多少薪");
            int months = scanner.nextInt();
            int yearSalary = months*monthSalary;//年薪

            System.out.println("年薪是"+yearSalary);
            if(yearSalary>=1000000&& yearSalary<2000000){
                System.out.println("恭喜你，超过了99%的国人");
            }else if(yearSalary>=200000){
                System.out.println("恭喜你，超过了100%的国人");
            }
            System.out.println("请输入exit或者next,exit退出程序，next计算下一个年薪");
            scanner.nextLine();
            String command = scanner.nextLine();

            if ("exit".equals(command)) {
                System.out.println("退出软件");
                break;
            }else if("next".equals(command)){
                System.out.println("计算下一个用户的的年薪");
                continue;
            }else {
                System.out.println("指令错误，，程序退出");
                break;
            }




        }
    }
}
