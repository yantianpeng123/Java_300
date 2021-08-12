/**
 * @ yaitianpeng
 * @date 2021-06-28 下午10:51
 */
package com.yantianpeng.day_09.test_a;

public class Students {


    public static void main(String[] args) {
        Person person = new Person();
        person.test_default();//可以在同一个包下面访问
        person.test_public();//可以在任何地方访问
        person.name="张三";
//        person.age =  12; private私有化属性 ，不可以在其他类中访问



    }

}
