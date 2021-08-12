/**
 * @ yaitianpeng
 * @date 2021-06-11 下午2:51
 *
 * 测试构造器
 *
 */
package com.yantianpeng.day_06;

public class Point {

    double x,y;

    public Point(double _x,double _y){
        x = _x;
        y = _y;
    }


    public double adddouble(Point point){
        return Math.sqrt((x-point.x)*(x-point.x)+(y-point.y)*(y-point.y));
    }


    public static void main(String[] args) {
        Point point1= new Point(3,4);
        Point point2 =new Point(0,0);
        double aa = point1.adddouble(point2);
        System.out.println(aa);
    }
}
