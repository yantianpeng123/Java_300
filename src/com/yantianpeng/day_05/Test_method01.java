package com.yantianpeng.day_05;

import java.util.Scanner;

public class Test_method01 {
    public static void main(String[] args) {
        System.out.println("请出入员工姓名");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入该员工的工资:");
        double salary = scanner.nextDouble();
        System.out.println("请输入员工的迟到时间");
        scanner.nextLine();
        int latetime = scanner.nextInt();
        chidao(name,salary,latetime);
    }


    //定义一个方法处理迟到问题。
    //输入参数 员工名称和月薪
    //处理逻辑:
    //迟到10分钟，警告。。迟到11-20分钟 罚款100。迟到21-30分钟 罚款200
    //迟到30分钟以上 扣除半天工资
    //迟到1个小时以上，按照旷工处理扣除3日工资
    //输出返款金额和处理意见

    public static void chidao(String name,double salary,int latetime){
        double fakuan = 0;
        if(latetime<0&& latetime>=10){
            System.out.println("警告！！！以后不在迟到啦");
        }else if(latetime>=11&& latetime<=20){
            System.out.println("罚款100元");
        }else if(latetime>=21&& latetime<=30){
            System.out.println("罚款200元");
        }else if (latetime>=31&&latetime<=60){
            fakuan = (int)(salary/21.75*2);
            System.out.println("扣除半天工资"+fakuan);
        }else {
            fakuan = (int)(salary/21.75)*3;
            System.out.println("扣除三天工资:"+fakuan);

        }

    }
}
