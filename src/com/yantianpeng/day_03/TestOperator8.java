package com.yantianpeng.day_03;

/**
 *
 * 强制类型转换
 */
public class TestOperator8 {
    public static void main(String[] args) {
        double x =3.14;
        int nx  = (int)x;//强制转换为整数，会造成精度丢失
        System.out.println(nx);

        //当一种类型强制转换为另外一种类型，而又超过目标类型的表数范围，就会被截断成一个完全不同的值。
        int i =334;
        //byte b =(int)i;//超出范围，会造成强制转换失败。
        int c =97;
        System.out.println((char)c);//int类型转换为char类型

    }
}
