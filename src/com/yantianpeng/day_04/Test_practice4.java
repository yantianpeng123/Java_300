package com.yantianpeng.day_04;

import java.util.Scanner;

/**
 *
 */
public class Test_practice4 {
    public static void main(String[] args) {
        //个税计算器
        //通过键盘输入用户月薪
        //百度搜索一个个税计算方式，计算出应缴纳的税款
        //直到键盘输入exit,则退出程序


//        个人所得税预扣率表一（居民个人工资、薪金所得预扣预缴适用）
//        级数	累计预扣预缴应纳税所得额	预扣率（%）	速算扣除数
//        1	不超过36,000元的部分	        3	            0
//        2	超过36,000元至144,000元的部分	10	            2520
//        3	超过144,000元至300,000元的部分	20	            16920
//        4	超过300,000元至420,000元的部分	25	            31920
//        5	超过420,000元至660,000元的部分	30	            52920
//        6	超过660,000元至960,000元的部分	35	            85920
//        7	超过960,000元的部分	45	181920

        //应纳税所得额=15000-5000（累计减除费用）-3000（累计专项扣除）-
        // 4000（累计专项附加扣除）-200（累计依法确定的其他扣除）=2800元

        //2800*0.03

        System.out.println("个税计算器");
        double fail =0;
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("请输入你月薪");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("请输入每个月工资是否一致：y/n");
            String yes_on= scanner.nextLine();
            if(yes_on.equals("y")){
                System.out.println("请输入当前是几月");
//                scanner.nextLine();
                int months = scanner.nextInt();
                System.out.println("截止到目前你的工资为:"+(salary*months));
                double yingjiao = (salary*months)-(months)*5000;
                if(yingjiao>0&&yingjiao<5000){
                    fail = 0;
                }else if(5000<=yingjiao&&yingjiao<=36000){
                    fail = yingjiao*0.03;
                }else if(36000<yingjiao&&yingjiao<=144000){
                    fail= yingjiao*0.1-2520;
                }
            }
            System.out.println("个人所的税计算中,请稍后...");

            System.out.println("当月的个人所得税为:"+fail);

        }


    }
}
