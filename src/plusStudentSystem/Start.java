package plusStudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/25 13:15
 * @project_name TestAll
 */
public class Start {
    public static void main(String[] args) {
        ArrayList<User> lists = new ArrayList<>();
        User user1 = new User("xlc123", "xlc456",
                "18884841872", "513001199909262418");
        lists.add(user1);
        while (true) {
            System.out.println("学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");
            Scanner scanner = new Scanner(System.in);
            String order = scanner.next();

            switch (order) {
                case "1" -> log_in(lists);
                case "2" -> register(lists);
                case "3" -> forgetPassword(lists);
                default -> System.out.println("指令错误");
            }
        }
    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> lists) {
        Scanner scanner = new Scanner(System.in);
        String number;
        String name;
        String newPassword;
        while (true) {
            System.out.println("您正在试图修改密码");
            System.out.println("请输入用户名");
            name = scanner.next();
            boolean flag = contains(lists, name);//判断是否有该用户
            if (!flag) {
                //系统中无该用户
                System.out.println("系统中无该用户");
                continue;
            }
            //系统中存在该用户,就要验证用户名和电话是否对应
            System.out.println("请输入该账户的注册电话");
            number = scanner.next();
            for (int i = 0; i < lists.size(); i++) {
                if (lists.get(i).getName().equals(name)
                        && lists.get(i).getPhoneNumber().equals(number)) {
                    System.out.println("验证成功，请输入新密码");
                    newPassword = scanner.next();
                    lists.get(i).setPassword(newPassword);
                    System.out.println("修改密码成功");
                    showUser(lists);
                    return;
                }
            }

        }

    }

    //注册
    private static void register(ArrayList<User> lists) {
        //输入用户名
        String name = checkName(lists);
        //输入注册密码
        String password = checkPassword();
        //输入电话号码
        String phoneNumber = checkPhoneNumber();
        //输入身份证号码
        String userID = checkUserID();
        //都合法之后，才创建user对象
        User newUser = new User(name, password, phoneNumber, userID);
        lists.add(newUser);
        System.out.println("用户名 " + name + " 的用户注册成功！");
        showUser(lists);

    }

    //登录
    private static void log_in(ArrayList<User> lists) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String password;
        String code;
        System.out.println("请输入用户名");

        while (true) {
            name = scanner.next();
            boolean flag = contains(lists, name);
            //系统中无该用户
            if (!flag) {
                System.out.println("该用户未注册，请重新输入用户名");
                continue;
            }
            //用户名存在，就提示输入密码
            System.out.println("请输入密码");
            password = scanner.next();
            System.out.println("请输入验证码");
            code = getCode();
            System.out.println(code);
            //验证码输入时忽略大小写
            if (!code.equalsIgnoreCase(scanner.next())) {
                //验证码错误
                System.out.println("验证码错误，请重新登录");
                continue;
            }
            //验证码正确就需要判断 用户名与密码是一致正确
            for (int i = 0; i < lists.size(); i++) {
                if (name.equals(lists.get(i).getName())
                        && password.equals(lists.get(i).getPassword())) {
                    //用户名和密码都正确，登录成功
                    System.out.println("用户 " + name + " 登陆成功！");
                    studentMenu.studentMenuStart(); //调用子程序
                    return;
                }
            }
            System.out.println("密码错误，请重新输入用户名");
            continue;
        }
    }

    //检查用户名的输入是否合法
    private static String checkName(ArrayList<User> lists) {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名");
        while (true) {//用户名
            name = scanner.next();
            //长度不合法
            if (name.length() < 3 || name.length() > 15) {
                System.out.println("用户名长度不合法，请重新输入");
                continue;
            }
            //长度合法
            for (int i = 0; i < name.length(); i++) {
                //但凡有一位既不是字母又不是数字，则重新输入
                if (!((name.charAt(i) <= 'z' && name.charAt(i) >= 'a') || (name.charAt(i) <= 'Z' && name.charAt(i) >= 'A') || (name.charAt(i) <= '9' && name.charAt(i) >= '0'))) {
                    System.out.println("用户名不合法，请重新输入");
                    break;//跳出当前for循环，进入while循环
                }
            }

            //长度合法，并且每一位均是字母和数字
            int count = 0;//用来统计字母的个数
            for (int i = 0; i < name.length(); i++) {
                if ((name.charAt(i) <= 'z' && name.charAt(i) >= 'a') || (name.charAt(i) <= 'Z' && name.charAt(i) >= 'A')) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("用户名为纯数字，请重新输入");
                continue;
            } else {
                if (!contains(lists, name)) {
                    //并且当前用户名在列表不存在，既可以新建此用户名
                    System.out.println("用户名 " + name + " 可用！");
                    return name;
                } else {
                    System.out.println("该用户名在列表已经存在，请重新输入");
                    continue;
                }
            }
        }
    }

    //检查用户名是否已经存在
    private static boolean contains(ArrayList<User> lists, String name) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getName().equals(name)) {
                return true;//该用户名已经存在
            }
        }
        return false;
    }

    //判断两次输入的密码是否相同
    private static String checkPassword() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码");
            String firstPassword = scanner.next();
            System.out.println("请再次确认密码");
            String secondPassword = scanner.next();
            if (!firstPassword.equals(secondPassword)) {
                //两次密码不相同
                System.out.println("两次密码不同，请重新输入");
                continue;
            }
            return firstPassword;
        }
    }

    //检查电话号码
    private static String checkPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        System.out.println("请输入电话号码");
        while (true) {
            phoneNumber = scanner.next();
            //长度不合法
            if (phoneNumber.length() != 11 || phoneNumber.startsWith("0")) {
                System.out.println("电话号码长度不合法 或者 以0开头，请重新输入电话号码");
                continue;
            }
            //长度合法
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (!(phoneNumber.charAt(i) <= '9' && phoneNumber.charAt(i) >= '0')) {
                    //但凡有一位不是数字，则重新输入
                    System.out.println("电话号码不合法，请重新输入电话号码");
                    continue;
                }
            }
            return phoneNumber;
        }

    }

    //检查身份证号码
    private static String checkUserID() {
        Scanner scanner = new Scanner(System.in);
        String userID;
        System.out.println("请输入身份证号码");
        while (true) {
            userID = scanner.next();
            if (userID.length() != 18 || userID.startsWith("0")) {
                System.out.println("长度不合法或者以0开头，请重新输入身份证号码");
                continue;
            }
            //长度合法且不以0打头,则先检查前17位
            for (int i = 0; i < userID.length() - 1; i++) {
                char c = userID.charAt(i);
                if (!(c <= '9' && c >= '0')) {
                    //但凡有一位不是数字，则重新输入
                    System.out.println("身份证号码不合法，请重新输入");
                    continue;
                }
            }
            //检查完前17位都合法的情况下，再检查第18位
            char endChar = userID.charAt(userID.length() - 1);
            if (!((endChar <= '9' && endChar >= '0') || endChar == 'x' || endChar == 'X')) {
                //最后一位既不是数字，也不是大小写x,则重新输入
                System.out.println("身份证最后一位不合法，请重新输入");
                continue;
            }
            return userID;
        }
    }

    //展示系统当前注册了哪些用户
    private static void showUser(ArrayList<User> lists) {
        System.out.println("系统当前注册的用户有以下");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getName() + " "
                    + lists.get(i).getPassword() + " "
                    + lists.get(i).getPhoneNumber() + " "
                    + lists.get(i).getUerID());
        }
    }

    //生成验证码
    private static String getCode() {
        Scanner scanner = new Scanner(System.in);
        char[] code = new char[5];//存放验证码
        StringBuilder chars = new StringBuilder();//存放字母
        StringBuilder numbers = new StringBuilder();//存放数字
        Random random = new Random();
        for (int i = 0; i < 26; i++) {
            //添加小写字母
            chars.append((char) ('a' + i));//注意此处char与Character之间的转换是自动进行的
            //添加大写字母
            chars.append((char) ('A' + i));
        }
        for (int i = 0; i < 10; i++) {
            numbers.append((char) ('0' + i));
        }
        for (int i = 0; i < 4; i++) {//随机生成4个大小写字母
            int indexChars = random.nextInt(chars.length());
            code[i] = chars.charAt(indexChars);
        }
        //随机生成1位数字
        int indexNumber = random.nextInt(numbers.length());
        code[code.length - 1] = numbers.charAt(indexNumber);

        //打乱顺序(随机)
        for (int i = 0; i < code.length; i++) {
            int indexRandom = random.nextInt(code.length);
            char temp = code[indexRandom];
            code[indexRandom] = code[i];
            code[i] = temp;
        }
        return new String(code);
    }
}
