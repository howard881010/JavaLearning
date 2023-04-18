package com.itheima;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("=============ATM============");
            System.out.println("1. 帳戶登入");
            System.out.println("2. 帳戶開戶");
            System.out.println("請您選擇操作:");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    //Alt + Enter 可以創立method
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您輸入的操作命令不存在");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("帳戶登入操作");
        if (accounts.size() == 0) {
            System.out.println("對不起，當前系統中無任何帳戶");
            return;
        }
        while (true) {
            System.out.println("請您輸入登錄卡號");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {
                while (true) {
                    System.out.println("請您輸入密碼");
                    String password = sc.next();
                    if (acc.getPassword().equals(password)) {
                        System.out.println("登入成功");
                        showUserCommand(sc, acc, accounts);
                        return;
                    } else {
                        System.out.println("您輸入的密碼有誤");
                    }
                }
            } else {
                System.out.println("對不起，系統中不存在該帳戶卡號");
            }
        }
    }

    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("用戶操作頁");
            System.out.println("1. 查詢帳戶");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 轉帳");
            System.out.println("5. 修改密碼");
            System.out.println("6. 退出");
            System.out.println("7. 註銷帳戶");
            System.out.println("請選擇: ");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    showAccount(acc);
                    break;
                case 2:
                    depositMoney(acc, sc);
                    break;
                case 3:
                    drawMoney(acc, sc);
                    break;
                case 4:
                    transportMoney(acc, sc, accounts);
                    break;
                case 5:
                    updatePassword(acc, sc);
                    return;
                case 6:
                    System.out.println("退出成功，歡迎下次光臨");
                    return;
                case 7:
                    if (deleteAccount(acc, sc, accounts)) {
                        return;
                    } else {
                        break;
                    }
                default:
                    System.out.println("您輸入的操作命令不正確");

            }
        }


    }

    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("用戶銷戶功能");
        System.out.println("您真的要銷戶? y/n");
        String rs = sc.next();
        switch (rs) {
            case "y":
                if (acc.getMoney() > 0) {
                    System.out.println("您的帳戶還有錢沒有取完，不允許銷戶");
                    return false;
                } else {
                    accounts.remove(acc);
                    System.out.println("您的帳戶註銷完成");
                    return true;
                }
            default:
                System.out.println("好的，當前帳戶保留");
                return false;

        }
    }

    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("用戶密碼修改");
        while (true) {
            System.out.println("請您輸入當前密碼");
            String password = sc.next();
            if (password.equals(acc.getPassword())) {
                while (true) {
                    System.out.println("請您輸入新密碼");
                    String newPassword = sc.next();

                    System.out.println("請您確認新密碼");
                    String okPassword = sc.next();

                    if (okPassword.equals(newPassword)) {
                        acc.setPassword(okPassword);
                        System.out.println("修改密碼成功");
                        return;
                    } else {
                        System.out.println("您輸入的2次密碼不一致");
                    }
                }
            } else {
                System.out.println("您輸入的密碼不正確");
            }
        }

    }

    private static void transportMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("用戶轉帳功能");
        if (accounts.size() < 2) {
            System.out.println("當前系統中，不足2個帳戶，不能進行轉帳");
            return;
        }
        if (acc.getMoney() == 0) {
            System.out.println("對不起，您的帳戶沒有錢");
            return;
        }
        while (true) {
            System.out.println("請您輸入對方的卡號:");
            String cardId = sc.next();
            if (cardId.equals(acc.getCardId())) {
                System.out.println("對不起，你不可以自己進行轉帳");
                continue;  // 結束當前循環，進入下一次
            }
            Account account = getAccountByCardId(cardId, accounts);
            if (account == null) {
                System.out.println("對不起，你輸入的帳號不存在");
            } else {
                String userName = account.getUserName();
                String tip = '*' + userName.substring(1);
                System.out.println("請您輸入[" + tip + "]的姓氏");
                String preName = sc.next();
                if (userName.startsWith(preName)) {
                    while (true) {
                        System.out.println("請您輸入轉帳金額");
                        double money = sc.nextDouble();
                        if (money > acc.getMoney()) {
                            System.out.println("對不起，您的餘額不足，你最多可以轉" + acc.getMoney());
                        } else {
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(acc.getMoney() + money);
                            System.out.println("轉帳成功，您的帳戶還剩餘:" + acc.getMoney());
                            return;
                        }
                    }
                } else {
                    System.out.println("對不起，你輸入的訊息錯誤");
                }
            }
        }
    }

    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("用戶取錢功能");
        if (acc.getMoney() < 100) {
            System.out.println("對不起，當前帳戶餘額不夠100元，不能取錢");
            return;
        }
        while (true) {
            System.out.println("請您輸入取款金額");
            double money = sc.nextDouble();
            if (money > acc.getQuotaMoney()) {
                System.out.println("對不起，你當前的金額超過每次限額，每次最多可取: " + acc.getQuotaMoney());
            } else {
                if (money > acc.getMoney()) {
                    System.out.println("餘額不足，你的餘額是: " + acc.getMoney());
                } else {
                    System.out.println("恭喜你，取錢" + money + "元成功");
                    acc.setMoney(acc.getMoney() - money);
                    showAccount(acc);
                    return;
                }
            }
        }
    }

    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("用戶存錢操作");
        System.out.println("請您輸入存款金額");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        System.out.println("存錢成功，當前帳戶訊息如下");
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("當前帳戶訊息如下");
        System.out.println("卡號" + acc.getCardId());
        System.out.println("戶主" + acc.getUserName());
        System.out.println("餘額" + acc.getMoney());
        System.out.println("限額" + acc.getQuotaMoney());
    }

    // 用戶開戶
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("系統開戶");
        Account account = new Account();
        System.out.println("請您輸入帳戶用戶名");
        String userName = sc.next();
        account.setUserName(userName);

        // ctrl + alt + t 產生 while, if, for ....
        while (true) {
            System.out.println("請您輸入帳戶密碼");
            String password = sc.next();
            System.out.println("請您輸入確認密碼");
            String okPassword = sc.next();
            if (okPassword.equals(password)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("對不起，您輸入2次密碼不一致");
            }
        }

        System.out.println("請您輸入帳戶當次限額");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println("恭喜你," + userName + "您開戶成功，你的卡號是" + cardId);
    }

    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                return cardId;
            }
        }


    }

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
