package com.yantianpeng.day_04;

/**
 * 打印1到130之间的数字，每行现实5个
 */
public class Test_practice2 {
    public static void main(String[] args) {
        int i =0;
        while (i<131){
            System.out.print(i+" ");
            if ((i+1)%5==0){
                System.out.println("");
            }
            i++;
        }
    }
}
