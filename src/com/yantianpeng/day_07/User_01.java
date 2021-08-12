/**
 * @ yaitianpeng
 * @date 2021-06-21 下午11:00
 */
package com.yantianpeng.day_07;

public class User_01 {
    int id;
    String name;
    String pwd;

    static String  comPany ="北斗星IT科技";

    public User_01(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    };


    //非static方法
    public void login(){
        System.out.println("登陆名称:"+this.name);
    }

    //static方法
    public static void printCompany(){
        //static 属性可以直接调用
        System.out.println("公司名称是:"+comPany);
    }


    public static void main(String[] args) {
        //static 方法通过类名直接调用
        User_01.printCompany();
        //static 属性 通过类名直接调用
        User_01.comPany="上海新客科技";
        User_01.printCompany();
        User_01 user_01= new User_01(0,"闫天蓬","123456");
        //非static方法通过对象名.方法名调用
        user_01.login();

    }
}
