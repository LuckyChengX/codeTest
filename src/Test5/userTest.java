package Test5;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/19 10:04
 * @project_name TestAll
 */
public class userTest {
    public static void main(String[] args) {
        //正确的用户名和密码
        user rootUser = new user("root", "123");

        log(rootUser);
    }

    public static void log(user rootUser) {

        Scanner scanner = new Scanner(System.in);
        //3次登录机会
        for (int i = 0; i < 3; i++) {
            System.out.println("您一共有3次机会！这是第:" + (i + 1) + " 次！");
            System.out.println("请输入用户名:");
            String userName = scanner.next();
            System.out.println("请输入密码:");
            String userPassword = scanner.next();

            if (userName.equals(rootUser.getName()) &&
                    userPassword.equals(rootUser.getPassword())) {
                System.out.println("登录成功！");
                return;
            } else continue;
        }
        System.out.println("登陆失败！");
    }
}
