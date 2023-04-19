package d1_junit;

public class UserService {
    public String loginName(String loginName, String password) {
        if ("admin".equals(loginName) && "123456".equals(password)) {
            return "login success";
        } else {
            return "login failed";
        }
    }

    public void selectNames() {
        System.out.println(10/2);
        System.out.println("查詢全部用戶名稱成功");
    }
}
