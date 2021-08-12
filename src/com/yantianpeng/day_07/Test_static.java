/**
 * @ yaitianpeng
 * @date 2021-06-23 下午6:43
 *
 *
 * 测试静态导入 import static
 */
package com.yantianpeng.day_07;


import static java.lang.Math.PI; //导入静态变量PI
import static java.lang.Math.*;//导入Math类中所有的静态属性

public class Test_static {


    public static void main(String[] args) {
        System.out.println("圆周率是:"+PI);
        System.out.println("圆周率是:"+ PI);
    }

}
