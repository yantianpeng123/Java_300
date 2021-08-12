/**
 * @ yaitianpeng
 * @date 2021-06-23 下午10:12
 */
package com.yantianpeng.day_07;

public class Test_instanceof {

    //instanceof是二元运算符，左边是对象，右边是类，当对象是该类或者子类所创建的对象的时候返回的是true
    //否则返回的事false;



    public static void main(String[] args) {

        User user= new User(1,"张三");
        System.out.println(user instanceof User);//返回的true
//        System.out.println(user instanceof User_01);//返回的是false
    }



}
