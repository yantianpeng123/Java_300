/**
 * @ yaitianpeng
 * @date 2021-06-25 下午11:23
 */
package com.yantianpeng.day_08;

public class TestChilder extends  TestFather {


    public int id ;

    public void f(){
       super.f();//调用父类中的方法的和属性
       id = 200;
       System.out.println("子类中id的值是:"+id);
        System.out.println(id);//调用子类中的id。
        System.out.println(super.id);//调用父类中的id
    }


    public static void main(String[] args) {
        TestChilder testChilder =new TestChilder();
        testChilder.f();
    }
}
