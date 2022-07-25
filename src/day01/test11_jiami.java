package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/16 11:46
 * @project_name TestAll
 */

/*
 * 需求：某系统的数字密码（大于0），比如 1983，采用加密方式进行传输。
 * 规则：先得到每位数，然后每位都加上 5 ，再对 10 求余，最后对所有数字进行反转，得到一串新数。
 * 原文  1   9    8   3
 * +5    6  14   13   8
 * %10   6   4  3     8
 * 反转   8   3  4     6
 * 加密后的结果是：8346
 * */
public class test11_jiami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要加密的数字： ");

        int number = scanner.nextInt();
        int temp = number; //用来临时保存number 的值方便后面使用。
        int count = 0;//用来统输入数字的位数长度

        while (number != 0) {//统计输入数字长度过程
            number = number / 10;
            count++;
        }

        int[] num = new int[count];//原密码（动态定义数组）

        //把整数的每一位添加到数组中,倒序。
        for (int i = num.length - 1; i >= 0; i--) {
            num[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < num.length; i++) {// + 5 和 % 10
            num[i] = num[i] + 5;
            num[i] = num[i] % 10;
        }

        for (int i = 0, j = num.length - 1; i < j; i++, j--) {//反转（重点）
            int exchange;
            exchange = num[i];
            num[i] = num[j];
            num[j] = exchange;
        }


        int result = 0;
        for (int i = 0; i < num.length; i++) {//把数组结果拼接为数字
            result = result * 10 + num[i];
        }
        System.out.println("加密后的结果是： " + result);

//        System.out.println("加密后的数字为： "+result);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]);
//        }
    }
}
