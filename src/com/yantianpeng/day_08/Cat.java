/**
 * @ yaitianpeng
 * @date 2021-06-24 上午8:54
 */
package com.yantianpeng.day_08;

public class Cat extends Object {

    int id;
    String name;
    String pwd;

    //重写toString方法
    public String toString(){
        return "我的编号是:"+id+",w我的名字是"+name;
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.toString());
    }
}
