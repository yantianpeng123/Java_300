package com.yantianpeng.day_04;

/**
 *
 */
public class Test_break {
    public static void main(String[] args) {
        //随机产生1到100的之间的数，遇到88的时候停止循环,并统计产生多多少次
        int count =0;//统计运行了多少次
        while (true){
            count++;
            int i = (int)Math.round(Math.random()*100);//产生的随机数
            if (i==88){
                break;//停止循环
            }
        }
        System.out.println("总共循环了:"+count+"次");


        //把100到150之间不可以被3整除的数输出，每行显示5个
        int count_01 = 0;
        for (int i = 100; i <151 ; i++) {
            if(i%3==0){
                continue;
            }
            count_01++;
            System.out.print("当前的值是:"+i+"\t");
            if (count_01%5==0){
                System.out.println();
            }
        }
        //打印100到150之间的质数
        outer:for (int i = 100; i <150 ; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.println(i+"\t");
        }
    }





}
