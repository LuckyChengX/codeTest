package day01;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/16 19:27
 * @project_name TestAll
 */

/*
 * 大 V 直播抽奖，奖品是现金红包，分别有 {2，588，888，1000，10000} 5个奖金。
 * 请用代码模拟抽奖，打印出每个奖项，奖项的顺序要随机并且不重复。
 * 打印效果如下：（随即顺序，不一定是下面顺序）
 * 888元奖金被抽抽出
 * 588元奖金被抽抽出
 * 1000元奖金被抽抽出
 * 10000元奖金被抽抽出
 * 2元奖金被抽抽出
 * */
public class test12_better {
    public static void main(String[] args) {

        int[] arr = {2, 588, 888, 1000, 10000};
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = random.nextInt(arr.length);
            //拿着 i 跟随机索引 randomIndex 上的值进行交换。
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
