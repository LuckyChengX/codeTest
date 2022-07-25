package day03;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/18 14:57
 * @project_name TestAll
 */
public class Girls {
    private String name;
    private int age;
    private char gender;
    private String like;

    public Girls() {
    }

    public Girls(String name, int age, char gender, String like) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
