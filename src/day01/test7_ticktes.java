package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 20:25
 * @project_name TestAll
 */
/*
 *机票价格按照淡季和旺季、头等舱和经济舱收费。
 * 输入：机票原价、月份、头等舱和经济舱。
 * 规则：旺季（5-10月），头等舱9折，经济舱8.5折。（淡季11月到来年的4月），头等舱7折，经济舱6.5折。
 * */
public class test7_ticktes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        String m = null;

        System.out.println("请输入机票原价：");
        int price = scanner.nextInt();


        System.out.println("请输入座位类型：0 为经济舱，1 为头等舱。");
        int seat = scanner.nextInt();
        String s = null;

        int cost = 0;

        if (month >= 5 && month <= 10) {//旺季
            m = "旺季";
            if (seat == 0) {//经济舱
                s = "经济舱";
                cost = (int) (price * 0.85);//强制类型转换（去掉小数）
            } else if (seat == 1) {//头等舱
                s = "头等舱";
                cost = (int) (price * 0.9);
            } else cost = -1;//无此座位类型
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {//淡季
            m = "淡季";
            if (seat == 0) {//经济舱
                s = "经济舱";
                cost = (int) (price * 0.65);//强制类型转换（去掉小数）
            } else if (seat == 1) {
                s = "头等舱";
                cost = (int) (price * 0.7);
            } else cost = -1;//无此座位类型
        }

        System.out.println("您预定的机票季节： " + m + "  舱位为：" + s + " " + "票价为： " + cost);
    }
}
