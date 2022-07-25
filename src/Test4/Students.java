package Test4;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/18 15:13
 * @project_name TestAll
 */
public class Students {
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Students() {
    }
}
