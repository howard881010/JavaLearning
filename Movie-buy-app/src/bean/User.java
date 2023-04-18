package bean;

public class User {
    private String userName;
    private String loginName;
    private String password;
    private char sex;
    private String phone;
    private Double money;

    public User(String userName, String loginName, String password, char sex, String phone, Double money) {
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
