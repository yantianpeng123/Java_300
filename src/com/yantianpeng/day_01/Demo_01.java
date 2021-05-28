package com.yantianpeng.day_01;

/**
 * 我是文档注释
 */
public class Demo_01 {

    int studentNum =1;//成员变量
    static  int Salary =  7800;//静态变量


    public static void main(String[] args) {
        //我是单行注释
        System.out.println("联系单行注释");
        /*
         * 我是多行注释
         */
        System.out.println("练习多行注释");


        //标识符命名
        int abc =13; //局部变量
        int 年龄 =13;//局部变量
        int $salary = 13;//局部变量
        int _year = 2020;//局部变量
        // 下面的是不合法的参数
        //int 123 = "不合法";
    }



    public void test(){
        int salary = 0;//局部变量
        int age  = 10; //局部变量
    }
}
