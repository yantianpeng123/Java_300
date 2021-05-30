package com.yantianpeng.day_03;

/**
 * 运算符
 */
public class TestOperator {

    public static void main(String[] args) {
        //算术运算
        int a =3;
        long b = 4;
        long c = a+b; //当其中一个为long的则，类型会转换为long类型。

        byte b_1 = 3;
        byte b_2 = 4;
        int b_3 =  b_1+b_2;//两个都是byte的的时候，结构自动转换为int类型

        //取余数:“余数”符号和左边操作数相同
        int e = 10%3;
        System.out.println(e); //结果是1
        int d =-10%3;
        System.out.println(d); //结果是-1;

        int g = 10%-3;
        System.out.println(g); //结果是1



        //自增和自减
        int a_01 = 30;
        a_01++; //相当于a_01 = a_01+1;
        System.out.println(a_01);

        int i =10;
        int h = i++; //i++ 先赋值，在执行自增
        System.out.println(h);

        int j = 10;
        int y = ++j;//++j,先执行自增，在赋值。
        System.out.println(y);



    }
}
