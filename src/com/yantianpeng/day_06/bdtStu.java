/**
 * @ yaitianpeng
 * @date 2021-06-10 下午10:46
 */
package com.yantianpeng.day_06;

public class bdtStu {
    //属性
    int id;

    String name;
    int age;
    //方法

    public void Study(String study){
        System.out.println("开始学习啦");
    }
    //构造方法---方法名称和类名称保持一致
    bdtStu(){

    }
    //程序的入口方法
    public static void main(String[] args) {
        bdtStu stu1 = new bdtStu();
        stu1.Study("sss");
        System.out.println(stu1.age);
        System.out.println(stu1.name);
        System.out.println(stu1.id);
    }
}
