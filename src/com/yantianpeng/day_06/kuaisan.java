/**
 * @ yaitianpeng
 * @date 2021-06-17 上午1:36
 */
package com.yantianpeng.day_06;

import javax.swing.*;
import java.util.Random;

public class kuaisan {

    public static  void get_count(){
        Random random = new Random();
        int i = random.nextInt(7);
        int j = random.nextInt(7);
        int k = random.nextInt(7);
        System.out.println("当前i是值:"+i+"当前j的值是:"+j+"当前k的值是:"+k);
        int sum_01 =  i+j+k;
        System.out.println("当前的结果是:"+sum_01);
       if(i==j&&i==k&&j==k){
           System.out.println("当前是大小单双--三个数相等");
       }else if (sum_01>=4&& sum_01<=10){
           System.out.println("当前的结果是:小");
       }else if(sum_01>=11&&sum_01<=17){
           System.out.println("当前的结果是大");
       }
    }



    public static void main(String[] args) {
         int i = 0;
         while (i<100){
             get_count();
             i++;
         }
    }
}
