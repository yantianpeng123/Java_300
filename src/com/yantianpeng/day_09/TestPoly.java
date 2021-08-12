/**
 * @ yaitianpeng
 * @date 2021-06-30 下午3:21
 */
package com.yantianpeng.day_09;


public class TestPoly {


    //定一个静态的方法
    static void animalCry(Animal animal){
        animal.shout();
    }
    //定义一个普通的方法
    public  void  test_poly_01(Animal animal){
        animal.shout();
    }


    public static void main(String[] args) {
        TestPoly testPoly= new TestPoly();
        //父类引用 = new 子类对象。
        Animal a1 = new Dog();//父类引用指向子类对象
        animalCry(a1);
        testPoly.test_poly_01(a1);
        Animal a2 = new Pig();
        animalCry(a2);
        testPoly.test_poly_01(a2);
    }
}
