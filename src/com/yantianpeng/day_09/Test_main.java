/**
 * @ yaitianpeng
 * @date 2021-06-30 下午2:56
 */
package com.yantianpeng.day_09;

public class Test_main {






    public static void main(String[] args) {
        //调用
        Test_person test_person= new Test_person();
        test_person.setAge(12);
        System.out.println(test_person.getAge());
        test_person.setFlag(true);
        System.out.println(test_person.isFlag());
        test_person.setName("张三");
        System.out.println(test_person.getName());

        //多态测试
        Animal animal = new Animal();



    }
}
