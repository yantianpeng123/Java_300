/**
 * @ yaitianpeng
 * @date 2021-06-25 下午11:37
 */
package com.yantianpeng.day_08;

public class TestPigFather {

    public static void main(String[] args) {
        //实例化子类，也会调用父类的无参数构造器
        TestPigchilder2 testPigchilder2= new TestPigchilder2();
    }
}


class  TestPigchilder1{
     public TestPigchilder1(){
         System.out.println("父类中的无参数构造器");
     }
}

class TestPigchilder2 extends TestPigchilder1{
        public TestPigchilder2(){
            //会默认调用父类的无参数构造器
            System.out.println("子类中无参数构造器");
        }
}