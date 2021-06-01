package com.yantianpeng.day_03;

/**
 * 位运算符
 */
public class TestOperator6 {

    public static void main(String[] args) {
        int a =7; //二进制是00111
        int b =8; //二进制是01000
        //按位与操作& 0&0 =0; 0&1=0;1&0=0 1&1=1
        //只要有一个是0就是0
        System.out.println(a&b);//结果是0
        //按位或运算 | 0|0 =0; 0|1=1;1|0=1;1|1=1;
        //只要有一个是1就是1;
        System.out.println(a|b);//结果是15
        //按位异或^ 0^0=0;0^1=1;1^0=1;1^1=0;
        //相同为0，不同为1;
        System.out.println(a^b);//结果是15
        //取反 ～1=0 ～0=1;
        //可能会涉及到补码操作。
        System.out.println(~b);//结果是-9

        //移位运算
        int c = 5;
        int d = 40;
        //相当于5*2*2*2; 左移
        System.out.println(c<<3);
        //相当于40/2/2/2  右移
        System.out.println(d>>3);

        int a_01 = 12;
        System.out.println("a="+a_01);
    }
}
