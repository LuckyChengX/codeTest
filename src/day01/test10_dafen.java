package day01;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/15 10:53
 * @project_name TestAll
 */
/*
 * 歌唱比赛中有 6 ，名评委打分。
 * 规则：去掉一个最高分和最低分的 4 个评委的平均分。
 * */
public class test10_dafen {
    public static void main(String[] args) {

        int[] score = new int[6];
        int max;
        int min;
        int maxIndex = 0;
        int minIndex = 0;
        double total = 0;
        double average = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第： " + i + " 次得分");
            int n = scanner.nextInt();
            score[i] = n;
        }

        max = min = score[0];//初始化

        for (int i = 0; i < score.length; i++) {//找最大最小值
            if (max < score[i]) {
                max = score[i];
                maxIndex = i;
            } else if (min > score[i]) {
                min = score[i];
                minIndex = i;
            }

        }

        for (int i = 0; i < score.length; i++) {//计算去掉最高分、最低分后的总成绩
            if (i == maxIndex || i == minIndex) {
                continue;
            } else {
                total += score[i];
            }
        }

        System.out.println("最高分：" + score[maxIndex] + " 最低分： " + score[minIndex] + " 总成绩： " + total);
        System.out.println("去掉最高分、最低分后的平均分为： " + total / (score.length - 2));


    }
}
