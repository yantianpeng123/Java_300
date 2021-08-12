/**
 * @ yaitianpeng
 * @date 2021-06-30 下午3:12
 */
package com.yantianpeng.day_09;

public class Animal {

        public  void shout(){
            System.out.println("叫了一声");
        }
}


class Dog extends Animal{
    public void  shout(){
        System.out.println("小狗叫");
    }
}


class Brid extends Animal{
    public  void shout(){
        System.out.println("小鸟叫");
    }
}

class Pig extends Animal{
    public void shout(){
        System.out.println("猪叫...");
    }
}





