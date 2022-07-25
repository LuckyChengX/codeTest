package day03;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/18 15:00
 * @project_name TestAll
 */
public class GirlTest {
    public static void main(String[] args) {
        Girls[] girlFriend = new Girls[4];
        double total = 0;
        double avg = 0;
        girlFriend[0] = new Girls("小丽", 18, '女', "唱歌");
        girlFriend[1] = new Girls("小杨", 22, '女', "看电影");
        girlFriend[2] = new Girls("小朱", 24, '女', "旅行");
        girlFriend[3] = new Girls("小丁", 21, '女', "刷剧");

        for (int i = 0; i < girlFriend.length; i++) {
            total += girlFriend[i].getAge();
        }
        avg = total / girlFriend.length;
        System.out.println("平均年龄:" + avg);

        for (int i = 0; i < girlFriend.length; i++) {
            if (girlFriend[i].getAge() < avg) {
                System.out.println(girlFriend[i].getName() + girlFriend[i].getAge() + girlFriend[i].getLike());
            }
        }
    }
}
