package Test7;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/22 13:28
 * @project_name TestAll
 */
/*
 * 生成验证码
 * 内容：可以是大写字母，可以是小写字母，还可以是数字
 * 规则：
 * 长度为5
 * 内容中是4位字母，1位数字。
 * 其中数字只有1位，但是可以出现在任何位置
 * */
public class stringTest4_YanZhengMa {
    public static void main(String[] args) {
        System.out.println(generateStr());
    }

    public static String generateStr() {
        char[] chars = new char[52];//存放大小写字母
        char[] numbers = new char[10];//存放数字
        char[] code = new char[5];//存放验证码的数组
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (char) ('0' + i);//强制类型转换
        }

        for (int i = 0; i < chars.length - 26; i++) {
            chars[i] = (char) ('A' + i);//大写字母
        }

        for (int i = 26; i < chars.length; i++) {
            chars[i] = (char) ('a' + i - 26);//小写字母
        }

        for (int i = 0; i < code.length - 1; i++) {//把字母放进验证码的前四位
            code[i] = chars[random.nextInt(chars.length)];
        }

        code[4] = numbers[random.nextInt(numbers.length)];//把数字放进验证码的第5位

        //打乱顺序
        for (int i = 0; i < code.length; i++) {
            int randomIndex = random.nextInt(code.length);
            char temp = code[i];
            code[i] = code[randomIndex];
            code[randomIndex] = temp;

        }
        return new String(code);
    }

}
