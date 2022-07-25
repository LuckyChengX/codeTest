package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 19:58
 * @project_name TestAll
 */
/*
 * 判断质数（大于3的质数）
 * */
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }

        }
        System.out.println(n + " 是否为质数：" + flag);
    }
}
