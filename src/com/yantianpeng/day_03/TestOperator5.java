package com.yantianpeng.day_03;

public class TestOperator5 {


    public static void main(String[] args) {
        boolean b = isRightIdCard("41272519931014999X");
        System.out.println(b);

        String Idcard =  generNum("19931014");
        System.out.println(Idcard);
    }


    //假设是河南周口鹿邑
    public static String generNum(String birthday){
        //数字顺序码为001;
        String pex_IdCard = "412725"+birthday+"999";
        char [] chars = pex_IdCard.toCharArray();
        //加权因子
        int [] ints =  {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int sum = 0;

        for (int i = 0; i <chars.length ; i++) {
            sum+=Integer.parseInt(String.valueOf(chars[i]))*ints[i];
        }

        int yu_01 = sum%11;
        String [] biao = {"1" ,"0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        return pex_IdCard+biao[yu_01];



    }

    /**
     * 判断身份证是否正确
     * @param IdCard
     * @return
     */
    public static  boolean isRightIdCard(String IdCard){
        char [] chars = IdCard.toCharArray();
        int [] ints =  {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int sum = 0;
        for (int i = 0; i <chars.length-1 ; i++) {
            int i1 = Integer.parseInt(String.valueOf(chars[i]));
            int i2 = ints[i];
            sum+=i1*i2;
        }
        int yu_01 = sum%11;

        String [] biao = {"1" ,"0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        return biao[yu_01].equals(String.valueOf(chars[chars.length-1]));
    }
}
