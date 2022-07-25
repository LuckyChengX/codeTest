package Test7;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/21 11:04
 * @project_name TestAll
 */

/*
 * 键盘录入一个字符串
 * 要求1:长度小于等于9
 * 要求2:只能是数字
 * 要求3:将内容变成对应的罗马数字
 * 注意:罗马数字里面没有0,如果键盘录入的数字包含0,可以变成 ""(长度为0的字符串)
 *
 * 对应关系:1-Ⅰ 2-Ⅱ 3-Ⅲ 4-Ⅳ 5-Ⅴ 6-Ⅵ 7-Ⅶ 8-Ⅷ 9-Ⅸ 0-""
 * */
public class stringBuilderTest3_LuoMa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.next();

        if (checkStr(str)) {
            String result = toLuoMa(str);
            System.out.println("转换后的结果是:" + result);
        }

    }

    public static String toLuoMa(String str) {
        String[] LuoMa = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//注意此处取得的为char类型的数据
            int number = c - 48;//将char转换成数字
            sb = sb.append(LuoMa[number]);
        }
        return sb.toString();
    }

    public static boolean checkStr(String str) {//判断输入是否合法
        if (str.length() > 9) {//长度不符合
            System.out.println("长度不合法!");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                System.out.println("输入不合法!");
                return false;
            }
        }
        return true;
    }
}
