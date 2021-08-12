/**
 * @ yaitianpeng
 * @date 2021-06-23 下午4:25
 */
package com.yantianpeng.day_07.test_02;
import com.yantianpeng.day_07.test_01.Students;//导入其他包中的类
import java.sql.Date;

public class class_01 {


    Date now;//导入sql包的中时间处理类

    public static void main(String[] args) {
        Students student= new Students(1,"张三",true);
        student.login();;
    }
}
