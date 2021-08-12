package com.yantianpeng.day_04;

/**
 * 计算1到100 的总和，偶数和奇数的和
 */
public class Test_practice1 {

    public static void main(String[] args) {
        int i = 0;
        int sumOuShu = 0;//偶数和
        int sumOdd = 0;//奇数和
        int sum  =0;//总和

        while (i<101){
            if(i%2==0){
                sumOuShu+=i;
            }else {
                sumOdd+=i;
            }
            i++;
        }
        sum=sumOdd+sumOuShu;
        System.out.println("1到100的总和是:"+sum);
        System.out.println("1到100的偶数和是:"+sumOuShu);
        System.out.println("1到100的奇数和是"+sumOdd);
    }
}
