package day01;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/16 16:44
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
public class test12_choujiang {
    public static void main(String[] args) {

        int[] arra = {2, 588, 888, 1000, 10000};//奖池
        int[] newArra = new int[arra.length];

        Random random = new Random();

        for (int i = 0; i < arra.length; ) {
            int randomIndex = random.nextInt(arra.length);

            if (!contains(newArra, arra[randomIndex])) {//不包含
                newArra[i] = arra[randomIndex];
                i++;
            }
        }

        for (int i = 0; i < newArra.length; i++) {
            System.out.println("恭喜您此次抽中的红包为： " + newArra[i]);
        }
    }

    public static boolean contains(int[] arrs, int price) {//判断是否包含
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == price) {
                return true;
            }
        }
        return false;
    }


}

