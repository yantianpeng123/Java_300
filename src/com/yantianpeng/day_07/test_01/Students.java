/**
 * @ yaitianpeng
 * @date 2021-06-23 下午4:23
 */
package com.yantianpeng.day_07.test_01;

public class Students {
    int id;
    String name;
    boolean a;


    public Students(int id,String name, boolean a){
        this.id = id;
        this.name =name;
        this.a =a;
    }

    public void login(){
        System.out.println("现在开始登陆..."+this.name);
    }


    public String print(){
        return "开始打印"+id;
    }
}
