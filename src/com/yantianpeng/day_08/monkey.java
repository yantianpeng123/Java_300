/**
 * @ yaitianpeng
 * @date 2021-06-25 下午10:52
 */
package com.yantianpeng.day_08;

import java.util.Objects;

public class monkey {

    int id;
    String name;
    String pwd;



    monkey(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    //重写父类的方法 比较只有id相等话就表示是同一个对象
    //equals方法的重写 用于比较对象的内容是否相等
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }else{
            if(obj instanceof monkey){
                monkey monkey1 = (monkey)obj;
                if(this.id==monkey1.id&&this.name==monkey1.name&&this.pwd==monkey1.pwd){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals_01(Object obj){
        if (this ==obj) return true;
        if (obj ==null&& getClass()!= obj.getClass()) return false;
        monkey monkey1= (monkey)obj;
        return this.id == monkey1.id && this.name ==monkey1.name;

    }



    public static void main(String[] args) {
        monkey monkey1 = new monkey(1,"闫天蓬","123456");
        monkey monkey2 = new monkey(1,"闫天蓬","123456");

        System.out.println(monkey1);
        System.out.println(monkey2.toString());
        //直接使用Object中的equals返回的false;
        //我们可以通过重写来实现判断对象是否相等
        System.out.println(monkey1.equals(monkey2));
    }

}
