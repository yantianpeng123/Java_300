/**
 * @ yaitianpeng
 * @date 2021-06-14 上午12:16
 */
package com.yantianpeng.day_06;

public class person {
    int age;
    String name;

    public  void show(){
        System.out.println("姓名"+name+"年龄:"+age);
    }


    public static void main(String[] args) {
        person person1= new person();
        person1.age =24;
        person1.name="闫天蓬";
        person1.show();


        person person2 = new person();
        person2.age =26;
        person2.name ="张安";
        person2.show();;

    }
}
