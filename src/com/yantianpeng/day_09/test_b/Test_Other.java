/**
 * @ yaitianpeng
 * @date 2021-06-29 下午3:20
 */
package com.yantianpeng.day_09.test_b;


import com.yantianpeng.day_09.test_a.Person;

public class Test_Other {



    public static void main(String[] args) {
        Person person= new Person();
        person.test_public();//在任何地方都可以被访问
//        person.test_default(); 不再同一个包下面 没办法访问。


    }
}
