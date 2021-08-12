package com.yantianpeng.day_04;

import java.util.Scanner;

/**
 *  测试switch
 */
public class TestIf_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1,2,3");
        int grade = scanner.nextInt();
        switch (grade){
            case 1:
                System.out.println("当前是大学一年级");
                break;
            case 2:
                System.out.println("当前是大学二年级");
                break;
            case 3:
                System.out.println("当前是大学三年级");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
