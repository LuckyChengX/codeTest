package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/13 12:23
 * @project_name TestAll
 * @function 判断回文数
 */

/*
 * 回文数
 * 给你一个整数，如果它是整数，那么就打印true,否则返回false.
 * 回文数是指正序（从左至右）和倒序（从右至左）读都是一样的整数。
 * 例如 123 是回文，而123不是。
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = scan.nextInt();

        //暂存这个输入的数
        int temp = x;

        //记录到过来之后的结果
        int outcome = 0;

        while (x != 0) {
            //从右往左区每一位数字
            int ge = x % 10;
            //修改记录的值
            x = x / 10;
            //把当前获取的数字拼接到最右边
            outcome = outcome * 10 + ge;
        }
        //打印
        System.out.println("您输入的数是： " + temp);
        System.out.println(outcome == temp);

    }

}
