package com.yantianpeng.day_04;

/**
 * 测试循环
 */
public class Test_while {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i<101){
            sum+=i;
            i++;
        }
        System.out.println("从0到100的值是:"+sum);
    }
}
