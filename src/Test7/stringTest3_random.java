package Test7;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/22 13:11
 * @project_name TestAll
 */
/*
 * 键盘输入任意字符串，打乱里面的内容
 *
 * 思路 ：把字符串先变成字符数组，然后再进行处理。
 * */
public class stringTest3_random {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String oldStr = scanner.next();

        System.out.println(randomStr(oldStr));


    }

    public static String randomStr(String str) {

        char[] chars = str.toCharArray();//转换为字符数组

        Random random = new Random();//随机对象

        //从0索引开始，跟一个随机索引进行位置进行交换
        //当数组里面的每一个元素都跟一个随机索引交换完毕之后，那么内容就但乱了
        for (int i = 0; i < chars.length; i++) {
            int randomNumber = random.nextInt(chars.length);//随机数

            char temp = chars[randomNumber];//交换过程
            chars[randomNumber] = chars[i];
            chars[i] = temp;
        }

        return new String(chars);
    }
}
