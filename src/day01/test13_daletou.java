package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/16 19:57
 * @project_name TestAll
 */
/*
 * 投注号码由 6 个红色球号码和 1 和蓝色球号码组成。红球号码从 1-33 中选择，
 * 并且每个号码不重复，蓝色球号码从 1-16 中选择，可以重复。
 *
 * */
public class test13_daletou {
    public static void main(String[] args) {
        int[] number = createNumber();//获取中奖号码
        System.out.println("此次中奖号码为： ");
        for (int i = 0; i < number.length; i++) {//查看中奖号码
            System.out.print(number[i] + " ");
        }
        System.out.println();

        int[] myNumber = createMyNumber();//自己输入中奖号码
        System.out.println("自己买的号码是：");
        for (int i = 0; i < myNumber.length; i++) {//查看自己输入的中奖号码
            System.out.print(myNumber[i] + " ");
        }


    }

    public static int[] createNumber() {//生成中奖号码
        int[] number = new int[7];

        Random random = new Random();
        for (int i = 0; i < 6; ) {//生成红球中奖号码
            int redNumber = random.nextInt(33) + 1;
            if (!contains(number, redNumber)) {
                number[i] = redNumber;
                i++;
            }
        }
        int blueNumber = random.nextInt(16) + 1;
        number[number.length - 1] = blueNumber;//蓝色球中奖号码
        return number;
    }

    public static boolean contains(int[] arra, int n) {//判断红球号码是否重复

        for (int i = 0; i < arra.length; i++) {
            if (arra[i] == n) {//重复的情况
                return true;
            }
        }
        return false;//非重复
    }

    public static int[] createMyNumber() {//用户输入自己的号码

        System.out.println("请输入自己的号码：");
        Scanner scanner = new Scanner(System.in);
        int[] myNumber = new int[7];

        for (int i = 0; i < myNumber.length - 1; ) {//用户输入红色号码
            System.out.println("请输入第: " + (i + 1) + " 个红球号码！");
            int redNumber = scanner.nextInt();
            if (!contains(myNumber, redNumber) && redNumber <= 33 && redNumber >= 1) {
                myNumber[i] = redNumber;
                i++;
            } else {
                System.out.println("您输入的第 " + (i + 1) + " 个红色球数字不合法！请重新输入！");
            }
        }
        while (true) {//用户输入蓝色球号码
            System.out.println("请输入蓝色球号码:");
            int blueNumber = scanner.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                myNumber[myNumber.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("您输入的蓝色球号码不合要求，请重新输入！");
            }
        }

        return myNumber;
    }
}

