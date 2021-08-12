/**
 * @ yaitianpeng
 * @date 2021-06-30 下午7:20
 * 定义抽象类
 * 定义一个抽象的方法 相当于是一个规范，具体的业务有子类去是实现，
 * 抽象类或者抽象方法只负责定义规范。
 *
 *
 *
 */
package com.yantianpeng.day_09;
//定义一个抽象类
public abstract class Test_abstract {
    //使用abstract修饰的方法  被称为抽象类
    abstract public void test_001();

    abstract public int test_002();

    abstract public String test_003();
}
