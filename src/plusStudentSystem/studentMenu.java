package plusStudentSystem;

import studentSystem.student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/25 16:13
 * @project_name TestAll
 */
public class studentMenu {
    public static void studentMenuStart() {


        ArrayList<student> lists = new ArrayList<>();
        student student1 = new student("202201", "张三", 24, "四川成都");
        student student2 = new student("202202", "李四", 25, "四川绵阳");
        lists.add(student1);
        lists.add(student2);

        showMain(lists);//展示主菜单


    }

    //主菜单
    public static void showMain(ArrayList<student> stuLists) {
        System.out.println("------------欢迎来到学生管理系统---------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择:");

        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();//接收的指令参数

        if (order == 1) {//添加学生
            addStudent(stuLists);
        } else if (order == 2) {//删除学生
            deleteStu(stuLists);
        } else if (order == 3) {//修改学生
            alterStu(stuLists);
        } else if (order == 4) {//查询学生
            showStuList(stuLists);
        } else if (order == 5) {//退出
            System.exit(0);
        } else System.out.println("您输入的指令有误！");

    }

    //添加
    public static void addStudent(ArrayList<student> stuLists) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要添加学生的id");
        String stu_id = scanner.next();
        System.out.println("请输入需要添加学生的姓名");
        String stu_name = scanner.next();
        System.out.println("请输入需要添加学生的年龄");
        int stu_age = scanner.nextInt();
        System.out.println("请输入需要添加学生的家庭住址");
        String stu_address = scanner.next();

        student newStu = new student(stu_id, stu_name, stu_age, stu_address);

        for (int i = 0; i < stuLists.size(); i++) {
            if (stuLists.get(i).getId().equals(newStu.getId())) {
                //在stuLists发现已经存在一个相同的id，添加失败
                System.out.println("id " + newStu.getId() + " 已经存在！");
                showMain(stuLists);//回到主菜单
            }
        }
        //遍历完stuLists未发现相同的id，则添加进stuLists。
        System.out.println("添加成功！");
        stuLists.add(newStu);
        showMain(stuLists);//回到主菜单
    }

    //删除
    public static void deleteStu(ArrayList<student> stuLists) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除学生的id");
        String stu_id = scanner.next();

        for (int i = 0; i < stuLists.size(); i++) {
            if (stuLists.get(i).getId().equals(stu_id)) {
                stuLists.remove(i);//删除
                System.out.println("删除成功！");
                showMain(stuLists);//回到初始菜单
                break;
            }
        }
        System.out.println("您想要删除的学生id " + stu_id + " 不存在！");
        showMain(stuLists);//回到初始菜单
    }

    //修改
    public static void alterStu(ArrayList<student> stuLists) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要修改的学生id");
        String stu_id = scanner.next();

        for (int i = 0; i < stuLists.size(); i++) {
            if (stuLists.get(i).getId().equals(stu_id)) {
                //修改
                System.out.println("请输入想要修改的姓名");
                stuLists.get(i).setName(scanner.next());
                System.out.println("请输入想要修改的年龄");
                stuLists.get(i).setAge(scanner.nextInt());
                System.out.println("请输入想要修改的家庭住址");
                stuLists.get(i).setAddress(scanner.next());
                System.out.println("修改成功！");
                showMain(stuLists);//回到主菜单
                break;
            }
        }
        System.out.println("您想要修改的学生id " + stu_id + " 不存在！");
        showMain(stuLists);//回到主菜单
    }

    public static void showStuList(ArrayList<student> stuLists) {
        if (stuLists.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询！");
            showMain(stuLists);//展示主菜单
        } else if (stuLists.size() != 0) {
            // /t为制表符
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < stuLists.size(); i++) {
                System.out.println(stuLists.get(i).getId() +
                        "\t" + stuLists.get(i).getName() +
                        "\t" + stuLists.get(i).getAge() +
                        "\t\t" + stuLists.get(i).getAddress());
            }
            showMain(stuLists);//展示主菜单
        }
    }
}
