/**
 * @ yaitianpeng
 * @date 2021-06-30 下午4:00
 */
package com.yantianpeng.day_09;



public class TestCasting {


    public static void main(String[] args) {

        Object obj = new String("张三");//向上转型
        //编译器认为obj是Object类型不是String类型，
        //编写程序的时候，如果想调用运行时的方法，只能进行类型的强制转换。
        // 不然通不过编译器的检查
        //obj.charAt(0);//无法调用该类型的方法，
        String str_01 =  (String)obj ; //向下转型
        System.out.println(str_01.charAt(0));//获取制定索引处的字符。
        System.out.println(str_01==obj);//返回的true,表示指向的是同一个引用。

        StringBuffer stringBuffer = (StringBuffer) obj;
        //会出现类型异常的错误，因为他的真是类型是String 而不是StringBuffer;
//        System.out.println(stringBuffer.charAt(0));

    }

}
