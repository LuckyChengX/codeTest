package day01;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 15:56
 * @project_name TestAll
 */

import java.util.Scanner;

/*
 * 求商和余数
 * 给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
 * 求得商和余数，要求不使用乘法、除法和%运算符。
 *
 * 被除数 / 除数 = 商...余数
 * */
public class test2 {
    public static void main(String[] args) {

        int m;//被除数
        int n;//除数

        Scanner scan = new Scanner(System.in);

        //输入被除数
        System.out.println("请输入被除数：");
        m = scan.nextInt();
        //输入除数
        System.out.println("请输入除数：");
        n = scan.nextInt();

        int count = 0;//记录商
        int resulte = 0;//记录余数


        while (m >= n) {
            m = m - n;
            count++;
            resulte = m;

        }
        System.out.println("商： " + count);
        System.out.println("余数： " + resulte);

    }
}
