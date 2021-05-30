package com.yantianpeng.day_03;

import javax.sound.midi.Track;

/**
 *
 */
public class TestOperator4 {


    public static void main(String[] args) {
        //整个表达式为false 前面第一个表达式为false 则后面的表达式不在计算。
       boolean b_01 = 1>2 && 2>(3/0);

       //会报错，前面的第一个表达式为false，后面的表达式的值会报错，所以整体会报错
       boolean b_04 = 1>2& 2>(3/0);


       boolean b_02 = true;
       boolean b_03 = false;

       System.out.println(b_02&b_03);//结果是false 与，有一个是false
       System.out.println(b_02|b_03);//结果是true; 或 ，有一个是true
        System.out.println(!b_02);//结果是为true  非 ，去反
        System.out.println(b_02^b_03);//结果是true 相同是false 不同是true
    }
}
