/**
 * @ yaitianpeng
 * @date 2021-06-11 下午8:33
 */
package com.yantianpeng.day_06;

public class bdtStu1 {

    int id;
    String name;
    double score;

    //有参数的构造器
    public bdtStu1(int id,String name,double score){
            this.id= id;//属性的赋值
            this.name=name;//属性的赋值
            this.score=score;//属性的赋值
    }
    //空值构造器
    public bdtStu1(){

    }


    public static void main(String[] args) {
        //使用构造器的 给变量初始值赋值
        bdtStu1 b1 =  new bdtStu1(1,"闫天蓬",100);
        bdtStu1 b2 = new bdtStu1(2,"曹永芳",100);

    }

}
