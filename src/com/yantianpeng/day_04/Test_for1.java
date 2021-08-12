package com.yantianpeng.day_04;

/**
 *for练习题
 */
public class Test_for1 {

    public static void main(String[] args) {
        //计算1到100的和
        int sum = 0;
        for(int i=0;i<101;i++){
             sum+=i;
        }
        System.out.println("1到100的和是"+sum);

        //循环输出9到1之间的数
        for(int i =9;i>0;i--){
            System.out.println("当前i的值是:"+i);
        }
        //循环输出90到0 之间的可以被3整除的数
        for(int i=90;i>0;i-=3){
            System.out.println("当前能被3整除i的值是"+i);
        }
    }
}
