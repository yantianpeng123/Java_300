package com.yantianpeng.day_05;

/**
 * 方法的重载
 */
public class Test_method02 {

    public static void main(String[] args) {
        add();
        add(1,2);
        add(1.0,20.0);
        add("张三",90);

    }


    /**
     *  方法的重载
     * @return
     */
    public static int add(){
        return 0;
    }

    /**
     * 方法的重载
     * @param i
     * @param j
     * @return
     */
    public static int add(int i ,int j){
        return i+j;
    }

    /**
     * 方法的重载
     * @param i
     * @param j
     * @param k
     * @return
     */
    public  static int add(int i,int j,int k){
        return i+j+k;
    }
    /**
     * 方法的重载
     * @param i
     * @param j
     * @return
     */
    public static double add(double i,double j){
        return i+j;
    }


    public static String add(String name,int i){
        return "name"+i;
    }
}
