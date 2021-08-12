/**
 * @ yaitianpeng
 * @date 2021-06-21 下午10:36
 */
package com.yantianpeng.day_07;

public class User {


    int id;
    String name;
    String pwd;


    public  User(int id ,String name){
        this.id = id;
        this.name =name;
    }

    public User(String pwd,int id,String name) {
        this(id,name);//可以调用其他类型的构造器，并且必须位于第一行
        this.pwd = pwd;
    }


    public void login(){
        System.out.println("我的用户名是:"+this.name);
    }

}
