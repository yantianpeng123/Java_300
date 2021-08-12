/**
 * @ yaitianpeng
 * @date 2021-06-23 下午7:45
 *
 * 测试继承类
 */
package com.yantianpeng.day_07;



public class Test_extends {


    public static void main(String[] args) {
        Student students = new Student(1,"闫天蓬","男","阿里巴巴员工");
        students.info();

    }
}

class  person{
    int id;
    String name;
    String sex;
}


class  Student extends person01 {
    String major;//学生自己的属性和方法



    public Student(int id,String name,String sex,String major){
        //其中id ,name ,sex 等属性都是从父类继承过来的
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }


    public void info(){
        System.out.println("我的名字是:"+this.name+",我的公司是:"+major);
    }
}