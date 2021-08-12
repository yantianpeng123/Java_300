package com.yantianpeng.day_04;

import com.sun.codemodel.internal.JWhileLoop;

/**
 * 测试do-while语句
 */
public class Test_dowhile {

    public static void main(String[] args) {
        int  i  = 0;
        int sum =0;
        do{
            sum+=i;
            i++;
        }while(i<101);
        System.out.println("1到100的和是:"+sum);
    }

}
