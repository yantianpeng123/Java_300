/**
 * @ yaitianpeng
 * @date 2021-06-07 下午10:40
 *
 *
 * 递归结构
 */
package com.yantianpeng.day_05;

public class Test_method03 {

    public static void main(String[] args) {
       int a =jiecheng(3);
        System.out.println(a);
        int b = Fibonacci(4);
        System.out.println(b);
    }


    /**
     * 计算阶乘
     * n=1 1*1
     * n=2 1*2
     * n=3 1*2*3;
     */
    public static int  jiecheng(int n){
        if(n==1){//递归头
            return 1;
        }else {//递归体
           return n*jiecheng(n-1);
        }
    }

    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    public static int Fibonacci(int n){
        if (n==0){//
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
