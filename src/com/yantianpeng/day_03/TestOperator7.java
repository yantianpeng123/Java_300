package com.yantianpeng.day_03;

/**
 *
 */
public class TestOperator7 {
    public static void main(String[] args) {
        int score = 100;
        int x =-100;
        String type = score<60?"不及格":"及格";
        System.out.println("type="+type);
        int flag = x>0?1:(x==0?0:-1);
        System.out.println("flag="+flag);
    }
}
