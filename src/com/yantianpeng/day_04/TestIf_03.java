package com.yantianpeng.day_04;

/**
 * 测试if-elseif-else多分支结构
 */
public class TestIf_03 {

    public static void main(String[] args) {
        int age  = (int)(100*Math.random());//生成0到99的数字
        System.out.print("生成的年纪是:"+age+",属于:");
        if(age<15){
            System.out.println("儿童，喜欢玩!");
        }else if(age<25){
            System.out.println("青年，要学习!");
        }else if(age<45){
            System.out.println("中年，要工作!");
        }else if(age<65){
            System.out.println("中老年,要补钙!");
        }else if(age<85){
            System.out.println("老年,多运动!");
        }else{
            System.out.println("老寿星,古来稀!");
        }
    }
}
