package Test6;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/19 11:03
 * @project_name TestAll
 */
public class charAtCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String str = scanner.next();

        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {//统计大写字母
                upperCount++;
            } else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {//统计小写字母
                lowerCount++;
            } else if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {//统计数字
                numberCount++;
            } else continue;
        }
        System.out.println(str + " 所包含的大写字母个数为 " + upperCount +
                " 小写字母个数为 " + lowerCount + " 字母个数为 " + numberCount);
    }
}
