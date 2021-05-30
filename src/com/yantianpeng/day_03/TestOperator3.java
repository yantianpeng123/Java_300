package com.yantianpeng.day_03;

/**
 * 测试关系运算符
 */
public class TestOperator3 {

    public static void main(String[] args) {
        int a  = 3;
        int b = 4;

        boolean c_01 = a>b;
        System.out.println(c_01);
        boolean c_02 = a>=b;

        System.out.println(c_02);

        boolean c_03 = a<b;
        boolean c_04 = a<=b;
        System.out.println(c_03);
        System.out.println(c_04);
        //char和int也是可以比较的
        char d = 'h';
        int d_01 =20;
        System.out.println(d>d_01);
    }
}
