package day02;

import java.util.Random;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/17 13:02
 * @project_name TestAll
 */

/*
 * 文字格斗游戏
 * 随机掉血，血量为 0 时，战斗结束。
 * */
public class test1 {
    public static void main(String[] args) {

        role role1 = new role(100, "李白");
        role role2 = new role(100, "小乔");

        int count = 0;
        while (true) {
            count++;
            int remainBlood = role1.active(role2);
            if (remainBlood == 0) {
                System.out.println("经过 " + count + " 次对战 " + role1.getName() + " KO了 " + role2.getName());
                break;
            }
            remainBlood = role2.active(role1);
            if (remainBlood == 0) {
                System.out.println("经过 " + count + " 次对战 " + role2.getName() + " KO了 " + role1.getName());
                break;
            }
        }

    }
}

class role {//人物类

    private int blood;
    private String name;

    public role() {//空构造函数
    }

    public role(int blood, String name) {//有参构造函数
        this.blood = blood;
        this.name = name;
    }

    public int active(role r) {//攻击方法

        Random random = new Random();
        int actBlood = random.nextInt(20) + 1;//随即攻击血量
        r.blood = r.blood - actBlood;//剩余血量
        r.blood = r.blood > 0 ? r.blood : 0;//剩余血量等于 0 则战斗结束

        System.out.println(this.name + " 攻击了 " + r.name + actBlood + " 血量！");
        return r.blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
