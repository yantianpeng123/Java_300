/**
 * @ yaitianpeng
 * @date 2021-06-23 下午10:45
 */
package com.yantianpeng.day_07;

public class Test_final {

    //该变量的值，不可以被修改
    final String name ="闫天蓬--开发工程师--5年--阿里P8";


    //该方法不可以被重写 但是可以被重载
    public final  void rest(){
        System.out.println("开始休息");
    }

}

final class A{
    //使用final修饰的话  表示此类不可以被继承
}