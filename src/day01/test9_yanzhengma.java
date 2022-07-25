package day01;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/15 10:16
 * @project_name TestAll
 */

/*
 * 定义方法实现随机产生一个 5 位的验证码。
 * 验证码格式：
 * 长度为 5
 * 前 4 位是大写字母或者小写字母
 * 最后一位是数字
 * */
public class test9_yanzhengma {
    public static void main(String[] args) {

        /*
         * 思路：在以后如果我们要在一堆没有什么规律的数据中随机抽取，可以先把这些数据放在数组中，
         * 再随机抽取一个索引。
         *
         * 本题：先把大写字母和小写字母放在数组中。
         *
         * 参见ASCII码表：小写字母从97开始的。大写字母从65开始。
         * */
        char[] code = new char[4];//用来存放随机产生的大小写字母

        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                chars[i] = (char) (i + 97);
            }//小写字母放入数组
            else {
                chars[i] = (char) (i + 65 - 26);
            }//大写字母(注意要减 26)放入数组
        }

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {//初始化数字数组
            num[i] = i;
        }

        Random random = new Random();
        for (int i = 0; i < code.length; i++) {//产生前 4 个随机字母。
            int index = random.nextInt(chars.length);//产生从 0 到 52 的随机数。（包括0 不包括52）
            code[i] = chars[index];//记录随机字母到验证码中
        }

        //产生验证码的第 5 位的随机数字
        int number = num[random.nextInt(num.length)];

        String str = "" + code[0] + code[1] + code[2] + code[3] + number;//字符串
        System.out.println("随机验证码： " + str);
    }
}
