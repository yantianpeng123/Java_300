package com.yantianpeng.day_04;

import java.util.Arrays;

/**
 *
 */
public class Test_for2 {
    public static void main(String[] args) {
        for(int i=0,j=i+1;i<10;i++,j=j*2){
            System.out.println("当前i的值是"+i+",当前j的值是:"+j);
        }


        for(int i =0;i<10;i++){
            for (int j = 0; j <10 ; j++) {
                System.out.println("当前i的值是:"+i+",当前j的值是:"+j);
            }
        }


        //嵌套循环实现九九乘法表
        for (int i = 0; i <10 ; i++) {
            for (int j = 1; j <i+1   ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        //打印五乘五的方阵
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //使用嵌套循环打印一下图形

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(j%2==0){
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }


        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if((i+j)%2==0){
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                }
            }
        }

    }
}
