package com.yantianpeng.day_03;

/**
 * 类型转换内存溢出
 */
public class TestOperator9 {
    public static void main(String[] args) {
        double a =3.419;
        int x  = (int)a;//浮点型转换为整数，直接舍弃小数部分
        System.out.println(x);

        int c  =99;
        System.out.println((char)c); //转换成char类型
        //byte 范围是-127到128之间
        // 300超出范围啦 会转换成一个完全没有关系的值
        byte b =(byte) 300;
        System.out.println(b);

        int money = 200000000;//20亿
        int year = 20;//20年
        int total = money*year;//超出total是负数，因为超出了int的范围,结果是一个完全不相关的值
        System.out.println("total = "+total);
        // 结果默认是int类型，但是超出了int的范围，结果在转换为long类型的话，
        // 会造成精度丢失。
        long total1 = money*year;
        System.out.println("total1="+total1);
        //先将其中一个数转换为long，整个表达式的值提升，全部使用long来计算。
        long  totla2 = (long)money* year;
        System.out.println("total2 ="+totla2);

    }
}
