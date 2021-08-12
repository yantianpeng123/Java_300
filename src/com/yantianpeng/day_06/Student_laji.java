/**
 * @ yaitianpeng
 * @date 2021-06-15 上午12:05
 *
 *
 * 对象的循环引用
 */
package com.yantianpeng.day_06;

public class Student_laji {

    String name;
    Student_laji student_laji;

    //s1和s2相互引用，导致他们引用计数器不是0，但实际上已经无效啦，但无法被系统识别到
    public static void main(String[] args) {
        Student_laji s1 = new Student_laji();
        Student_laji s2 = new Student_laji();
        s1.student_laji = s2;
        s2.student_laji = s1;
        s1=null;
        s2 =null;
    }
}
