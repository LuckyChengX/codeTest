package day01;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 20:04
 * @project_name TestAll
 */
/*
 * 猜1-100内的随机数
 * */
public class test6 {
    public static void main(String[] args) {

        //使用java已经定义好的 Random 这个类

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int number = random.nextInt(1, 100);//两个参数分别是上界和下界
            random.nextInt(100);
            System.out.println(number);
        }

    }
}
