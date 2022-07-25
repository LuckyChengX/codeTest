package day01;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/14 19:31
 * @project_name TestAll
 */

/*
 * 逢7过
 * 游戏规则：从任意一个数字开始报数，当你报的数字包含7或者是7的倍数都要说过。
 * 使用控制台打印1-100之间满足逢7过规则的数据
 * */
public class test3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
