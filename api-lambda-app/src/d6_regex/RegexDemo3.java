package d6_regex;

import java.util.Scanner;

public class RegexDemo3 {
    public static void main(String[] args) {
        checkPhone();
        checkEmail();

    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請您輸入註冊手機號碼");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手機號碼格是正確，註冊完成");
                break;
            } else {
                System.out.println("格式有誤");
            }
        }

    }

    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請您輸入註冊電話號碼");
            String phone = sc.next();
            // 027-3572457 027-3572457
            if (phone.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("電話號碼格式正確，註冊完成");
                break;
            } else {
                System.out.println("格式有誤");
            }
        }

    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請您輸入註測郵箱");
            String phone = sc.next();
            if (phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("手機號碼格是正確，註冊完成");
                break;
            } else {
                System.out.println("格式有誤");
            }
        }

    }


}
