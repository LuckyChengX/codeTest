package plusStudentSystem;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/25 13:15
 * @project_name TestAll
 */
public class User {
    private String name;
    private String password;
    private String phoneNumber;
    private String uerID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUerID() {
        return uerID;
    }

    public void setUerID(String uerID) {
        this.uerID = uerID;
    }

    public User(String name, String password, String phoneNumber, String uerID) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.uerID = uerID;
    }

    public User() {
    }
}
