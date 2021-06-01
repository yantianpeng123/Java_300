package com.yantianpeng.day_04;

/**
 * 测试if语句，一个简单的掷骰子
 */
public class TestIf_01 {
    public static void main(String[] args) {
       // double d_01 = Math.random();//生成0到1到随机数，包含0但是不包含1
        // System.out.println(d_01);
        //生成一个0到6之间的随机数
        int a = 1+(int)(Math.random()*6);
        int b = 1+(int)(Math.random()*6);
        int c = 1+(int)(Math.random()*6);

        int count =a+b+c;
        if (count>=15){
            System.out.println("手气不错，接着玩");
        }
        if(count>=10&& count<15){
            System.out.println("手气还可以");
        }
        if(count<10){
            System.out.println("手气太差了，去洗洗手");
        }
        System.out.println("第一次骰子得分是："+a+",第二次骰子是:"+b+",第三次骰子是:"+c);
        System.out.println("当前得分是："+count);


    }
}
