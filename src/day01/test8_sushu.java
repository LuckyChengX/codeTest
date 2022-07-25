package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/15 10:06
 * @project_name TestAll
 */
public class test8_sushu {
    public static void main(String[] args) {

        System.out.println("请输入一个数：我们帮您判断是否为质数。");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean flag = true;//标志位

        if (num > 2) {//判断大于2 的数是否为质数
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println("您输入的数： " + num + " 判断是否为质数的结果为： " + flag);
        } else {
            System.out.println("您输入的数不符合规定！");
        }

    }
}
