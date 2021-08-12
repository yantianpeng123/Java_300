/**
 * @ yaitianpeng
 * @date 2021-06-24 上午8:33
 */
package com.yantianpeng.day_08;

public class Taidi {


    Dog dog ;//把父类作为子类的属性，

    int age;


    public static void main(String[] args) {
        Taidi taidi= new Taidi();
        taidi.dog.shout();//通过组合的方式调用父类的方法
    }
}
