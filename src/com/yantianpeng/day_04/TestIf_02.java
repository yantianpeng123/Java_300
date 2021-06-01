package com.yantianpeng.day_04;

import java.util.Arrays;

/**
 *
 */
public class TestIf_02 {
    public  static  void main(String [] args){
        //随机生成一个0到4区间的半径，并根据半径求圆的周长和面积。
        double r =  4*Math.random();//生成0到4之间的随机数
        double area = Math.PI*r*r;//面积
        double circle = 2*r*Math.PI;//周长
        System.out.println("当前的半径是:"+r);
        if(area>=circle){
            System.out.println("当前的面积是:"+area+",当前的周长是:"+circle+",面积大于等于周长");
        }else{
            System.out.println("当前的面积是："+area+",当前的周长是:"+circle+",面积小于周长");
        }

    }
}
