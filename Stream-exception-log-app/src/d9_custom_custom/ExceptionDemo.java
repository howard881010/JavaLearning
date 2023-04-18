package d9_custom_custom;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(34);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkAge(int age) throws AgeIllegalException {
        if(age < 0 || age > 200) {
            // 拋出去一個異常對象給調用者
            // throw: 在方法內部直接創立一個異常對象，並從此點拋出
            // throws: 用在方法申明上的，拋出方法內部的異常
            throw new AgeIllegalException(age + "is illegal");
        } else {
            System.out.println("年齡合法");
        }
    }
}
