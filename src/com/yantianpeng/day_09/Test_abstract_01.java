/**
 * @ yaitianpeng
 * @date 2021-06-30 下午7:23
 */
package com.yantianpeng.day_09;
//继承抽象类的子类，必须实现父类的抽象方法
public class Test_abstract_01 extends Test_abstract {


    @Override
    public void test_001() {
        System.out.println("实现了父类的第一个方法...");
    }

    @Override
    public int test_002() {
        return 0;
    }

    @Override
    public String test_003() {
        return "001";
    }
}
