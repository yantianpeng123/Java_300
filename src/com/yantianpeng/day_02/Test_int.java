package com.yantianpeng.day_02;

/**
 * 变量类型
 */
public class Test_int {


    public static void main(String[] args) {
        byte a = 100;
        int b = 12292;
        int c = 05;// 表示是八进制
        int d = 0x15;// 表示的是十六进制
        int e = 0b01001; //表示的是二进制


        long f = 1233;//默认是int类型
        long f_1 = 123L;  //在后面加上一个l是long类型

        System.out.println(a);
        System.out.println(b);;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        float f_01 = 31.4F; //float类型赋值时需要添加后缀F或者f;
        float f_02 = 3.14f;

        double d1  = 12d; //double 类型赋值时需要添加后缀d或者D;
        double d2 = 12D;

        float f_03 = 0.01f;
        double d3 = 0.1/10;
        System.out.println(f_03);
        System.out.println(d3);
        System.out.println(f_03==d3);  //结果为false 因为两个变量的类型不一致


        //float和double一般用于做直接比较
        float f_04 =  233333333333L;
        float f_05 =  f_04+1;
        System.out.println(f_04);
        System.out.println(f_05);
        System.out.println(f_04==f_05); //f_04等于f_05 返回的是true;
        // 定义char字符
        char e1 = 'a';
        char e2 ='中';

        char e3 ='\u0078';
        System.out.println(e3);


        boolean flag = true;
        if (flag){
            //true分支
        }else{
            //false分支
        }

    }
}
