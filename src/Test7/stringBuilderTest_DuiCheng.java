package Test7;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/20 20:27
 * @project_name TestAll
 */

/*
 * 使用stringBuilder的场景：
 * 1.字符串的拼接；
 * 2.字符串的反转；
 * */
public class stringBuilderTest_DuiCheng {
    public static void main(String[] args) {
        //判断键盘输入的字符串是否是一个对称字符串

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");

        String str = scanner.next();

        String result = new StringBuilder().append(str).reverse().toString();

        if (str.equals(result)) {
            System.out.println("您输入的字符后是对称字符串！");
        } else {
            System.out.println("您输入的字符串不是对称字符串！");
        }
    }
}
