package Test4;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/18 15:15
 * @project_name TestAll
 */
public class studentTest {
    public static void main(String[] args) {

        Students[] students = new Students[10];//学生对象数组总长度
        students[0] = new Students("小明", 001, 22);
        students[1] = new Students("张三", 002, 23);
        students[2] = new Students("李四", 003, 24);

        //待添加的学生对象
        Students newStu = new Students("王麻子", 004, 18);
        boolean flag = addStudent(newStu, students);
        if (flag == true) {//添加成功则遍历所有学生信息
            System.out.println("添加成功！");
            show(students);
        }

        deleteStudent(students, newStu);//删除学生

        queryStudent(students, 002);//查询学生

    }

    //添加学生，通过学生id来判断唯一性
    public static boolean addStudent(Students st, Students[] sts) {
        int st_id = st.getId();
        int count = countStudents(sts);
        for (int i = 0; i < count; i++) {
            if (sts[i].getId() == st_id) {
                System.out.println(st_id + " 学号已经存在，添加失败！");
                return false;
            }

        }
        //添加学生对象进学生对象数组中
        sts[count] = st;//添加成功
        return true;
    }

    public static void show(Students[] sts) {//遍历对象数组
        int count = countStudents(sts);
        for (int i = 0; i < count; i++) {
            System.out.println("姓名:" + sts[i].getName() + " 学号: "
                    + sts[i].getId() + " 年龄:" + sts[i].getAge());
        }
    }

    public static int countStudents(Students[] sts) {//计算学生对象数组中的非空对象元素的个数
        int count = 0;
        for (int i = 0; i < sts.length; i++) {
            if (sts[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean deleteStudent(Students[] sts, Students st) {
        //删除
        int count = countStudents(sts);

        for (int i = 0; i < count; i++) {
            if (sts[i].getId() == st.getId()) {
                //删除成功的代码
                for (int i1 = i; i1 < count; i1++) {
                    sts[i1] = sts[i1 + 1];//覆盖掉需要删除的那个元素
                }
                System.out.println("删除成功！删除后的学生对象数组为:");
                show(sts);
                return true;
            }
        }
        System.out.println("删除失败！");
        return false;
    }

    //通过学生id查询
    public static boolean queryStudent(Students[] sts, int st_id) {
        int count = countStudents(sts);

        for (int i = 0; i < count; i++) {
            if (st_id == sts[i].getId()) {
                //查询成功
                System.out.println("查询成功！");
                sts[i].setAge(sts[i].getAge() + 1);
                show(sts);
                return true;
            }
        }
        //查询失败
        System.out.println("当前学生对象数组不包含学号为 " + st_id + " 的学生！");
        return false;
    }

}
