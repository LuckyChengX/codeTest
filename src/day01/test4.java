package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 19:42
 * @project_name TestAll
 */
/*
 * 需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根。
 * 结果只保留整数部分，小数部分将被舍去
 */
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //法一:借用Math中的方法
        //int  resulte = (int) Math.sqrt((double) x);

        //法二：笨方法--原理
        int pingfang;
        int resulte = 1;
        for (int i = 1; i < x; i++) {
            pingfang = i * i;
            if (pingfang > x) {
                resulte = i - 1;
                break;
            }
            resulte = i;
        }
        System.out.println(x + " 的平方根为 " + resulte);
    }
}
