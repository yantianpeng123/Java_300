/**
 * @ yaitianpeng
 * @date 2021-06-28 下午10:51
 */
package com.yantianpeng.day_09.test_a;

public class Person {


    private  int age;
     String name;//默认是:protected


    private void test_private(){
        System.out.println("测试private修饰符");
    }



    public void  test_public(){
        System.out.println("测试public修饰符");
    }


    void  test_default(){
        System.out.println("测试default修饰符");
    }


    public static void main(String[] args) {
        Person person= new Person();
        person.age = 12;//可以在同一个类中访问

    }

}
