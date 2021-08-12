package com.yantianpeng.day_05;

/**
 *
 * 测试方法
 *
 */
public class Test_method {

    public static void main(String[] args) {
        //方法的调用
        loveU();
        //方法的调用
        int a_01 = add(1,2);
        System.out.println(a_01);
    }

    //定义一个没有返回值的参数
    public static void loveU(){
        System.out.println("I Love U!");
    }

    //定义一个返回值为整数的方法
    public static int add(int num1,int num2){
        return num1+num2;
    }


}
