package run;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.MonitorInfo;
import java.math.BigDecimal;
import java.sql.Struct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class MovieSystem {

    // 1. 存儲很多用戶
    public static List<User> ALL_USERS = new ArrayList<>();

    // 2. 儲存系統全部商家和影片訊息
    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();


    // 定義一個靜態的User變量寄住當前登陸成功的用戶對象
    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    // 3. 準備測試數據
    static {
        Customer c = new Customer();
        c.setUserName("蔡忠浩");
        c.setLoginName("Howard");
        c.setPassword("1111");
        c.setSex('男');
        c.setMoney(10000.0);
        c.setPhone("2121321");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setUserName("蔡忠");
        c1.setLoginName("How");
        c1.setPassword("11");
        c1.setSex('男');
        c1.setMoney(1000.0);
        c1.setPhone("21221");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setUserName("老王");
        b.setLoginName("Wang");
        b.setPassword("Wang");
        b.setSex('男');
        b.setMoney(1000.0);
        b.setPhone("1231232134");
        b.setAddress("老王路110號");
        b.setShopName("老王的家");
        ALL_USERS.add(b);
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies);

        Business b1 = new Business();
        b1.setUserName("老張");
        b1.setLoginName("Chang");
        b1.setPassword("Chang");
        b1.setSex('男');
        b1.setMoney(1000000.0);
        b1.setPhone("123134");
        b1.setAddress("老張路520號");
        b1.setShopName("老張的電影院");
        ALL_USERS.add(b1);
        List<Movie> movies1 = new ArrayList<>();
        ALL_MOVIES.put(b1, movies1);
    }

    public static final Scanner SYC_SC = new Scanner(System.in);

    public static void main(String[] args) {
        showMain();
    }
    // 首頁
    private static void showMain() {
        while (true) {
            System.out.println("========首頁============");
            System.out.println("1. 登陸");
            System.out.println("2. 用戶註冊");
            System.out.println("3. 商家註冊");
            System.out.println("請輸入操作命令: ");
            String command = SYC_SC.nextLine();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                case "3":
                default:
                    System.out.println("命令有誤，請重新輸入");


            }
        }

    }

    private static void login() {
        while (true) {
            System.out.println("請您輸入登陸名稱");
            String loginName = SYC_SC.nextLine();
            System.out.println("請您輸入登陸密碼");
            String password = SYC_SC.nextLine();

            // 1.根據登陸名查詢用戶對象
            User u = geyUserByLoginName(loginName);
            // 2. 判斷用戶對象是否存在
            if (u != null) {
                // 3. 判斷密碼
                if (u.getPassword().equals(password)) {
                    loginUser = u; // 記住登陸成功的用戶
                    LOGGER.info(u.getUserName() + "登入成功");
                    // 判斷用戶是商家還是顧客
                    if (u instanceof Customer) {
                        showCustomerMain();
                    } else {
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("密碼錯誤，請重新輸入");
                }
            } else {
                System.out.println("登陸名稱錯誤，請重新輸入");
            }
        }
    }
    // 商家操作介面
    private static void showBusinessMain() {
        User u1 = new Business();
        while (true) {
            System.out.println("========商家操作介面==========");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "歡迎進入系統"));
            System.out.println("請您選擇要操作的功能");
            System.out.println("1. 展示詳情");
            System.out.println("2. 上架電影");
            System.out.println("3. 下架電影");
            System.out.println("4. 修改電影");
            System.out.println("5. 退出");
            System.out.println("請您輸入您要的操作命令");
            String command = SYC_SC.nextLine();
            switch (command) {
                case "1":
                    showBusinessInfos();
                    break;
                case "2":
                    addMovie();
                    break;
                case "3":
                    deleteMovie();
                    break;
                case "4":
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "下次歡迎再來");
                    return;
                default:
                    System.out.println("命令有誤，請重新輸入");


            }
        }
    }

    private static void updateMovie() {
        System.out.println("========商家修改電影==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        if (movies.size() == 0) {
            System.out.println("當前無片可以修改");
            return;
        }
        while (true) {
            System.out.println("請您輸入需要修改的電影名稱");
            String moviesName = SYC_SC.nextLine();
            Movie movie = getMovieByName(moviesName);
            if (movie != null) {
                System.out.println("請您輸入修改后的片名: ");
                String name = SYC_SC.nextLine();
                System.out.println("請您輸入修改后的主演: ");
                String actor = SYC_SC.nextLine();
                System.out.println("請您輸入修改后的時長: ");
                String time= SYC_SC.nextLine();
                System.out.println("請您輸入修改后的票價: ");
                String price = SYC_SC.nextLine();
                System.out.println("請您輸入修改后的票數: ");
                String totalNumber = SYC_SC.nextLine();
                while (true) {
                    try {
                        System.out.println("請您輸入修改後的放映時長: ");
                        String stime = SYC_SC.nextLine();
                        movie.setActor(actor);
                        movie.setName(name);
                        movie.setPrice(Double.valueOf(price));
                        movie.setTime(Double.valueOf(time));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("恭喜妳修好影片了");
                        showBusinessInfos();
                        return;
                    } catch (ParseException e) {
                        LOGGER.error("時間出了毛病");
                        throw new RuntimeException(e);
                    }
                }
            } else {
                System.out.println("沒有此部電影");
                System.out.printf("請問繼續修改嗎? y/n");
                String command = SYC_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }

    }

    private static void deleteMovie() {
        System.out.println("========商家下架電影==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        if (movies.size() == 0) {
            System.out.println("當前無片可以下架");
            return;
        }
        while (true) {
            System.out.println("請您輸入需要下架的電影名稱");
            String moviesName = SYC_SC.nextLine();
            Movie movie = getMovieByName(moviesName);
            if (movie != null) {
                movies.remove(movie);
                System.out.println("妳當前店鋪已經成功下架了: " + movie.getName());
                showBusinessInfos();
                return;
            } else {
                System.out.println("沒有此部電影");
                System.out.printf("請問繼續下架嗎? y/n");
                String command = SYC_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }


    }

    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    private static void addMovie() {
        System.out.println("========商家上架電影==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(loginUser);

        System.out.println("請您輸入片名: ");
        String name = SYC_SC.nextLine();
        System.out.println("請您輸入主演: ");
        String actor = SYC_SC.nextLine();
        System.out.println("請您輸入時長: ");
        String time= SYC_SC.nextLine();
        System.out.println("請您輸入票價: ");
        String price = SYC_SC.nextLine();
        System.out.println("請您輸入票數: ");
        String totalNumber = SYC_SC.nextLine();


        while (true) {
            try {
                System.out.println("請您輸入放映時長: ");
                String stime = SYC_SC.nextLine();
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price), Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已經成功上架了: <" + movie.getName() + ">");
                return;
            } catch (ParseException e) {
                LOGGER.error("時間出了毛病");
                throw new RuntimeException(e);
            }
        }
    }

    // 展示商家詳細訊息
    private static void showBusinessInfos() {
        System.out.println("========商家詳情介面==========");
        LOGGER.info(loginUser.getUserName() + "在看自己的信息");
        // 根據商家對象，最為Map的key，取得對應的值
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t電話" + business.getPhone() + "\t\t地址" + business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        if (movies.size() > 0) {
            System.out.println("片名\t\t\t時長\t\t時常\t\t評分\t\t票價\t\t餘票數量\t\t放映時間");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getTime() + "\t\t" + movie.getScore()+ "\t\t"  + movie.getPrice()+ "\t\t"
                        + movie.getNumber()+ "\t\t" + sdf.format(movie.getStartTime()));

            }
        } else {
            System.out.println("妳的店舖沒有影片可以播");
        }
    }

    // 客戶操作介面
    private static void showCustomerMain() {
        System.out.println("========客戶操作介面==========");
        System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "歡迎進入系統"));
        System.out.println("請您選擇要操作的功能");
        System.out.println("1. 展示全部影片信息功能");
        System.out.println("2. 根據電影名稱查詢電影信息");
        System.out.println("3. 評分功能");
        System.out.println("4. 購票功能");
        System.out.println("5. 退出系統");
        while (true) {
            System.out.println("請您輸入您要的操作命令");
            String command = SYC_SC.nextLine();
            switch (command) {
                case "1":
                    showAllMovies();
                    break;
                case "2":

                    break;
                case "3":
                    break;
                case "4":
                    buyTicket();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("命令有誤，請重新輸入");


            }
        }

    }
    // 用戶購票功能
    private static void buyTicket() {
        showAllMovies();
        System.out.println("========用戶購票功能============");
        while (true) {
            System.out.println("請您輸入需要購票的門店");
            String shopName = SYC_SC.nextLine();
            Business business = getUserByShopName(shopName);
            if (business == null) {
                System.out.println("對不起，沒有該店鋪，請確認");
            }else {
                List<Movie> movies = ALL_MOVIES.get(business);
                if(movies.size() > 0) {
                    while (true) {
                        System.out.println("請你輸入需要購買電影名稱: ");
                        String movieName = SYC_SC.nextLine();

                        // 去當前商架下，查詢該電影對象
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if (movie != null) {
                            while (true) {
                                System.out.println("請你輸入要購買的電影票張數: ");
                                String number = SYC_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                if(movie.getNumber() >= buyNumber) {
                                    // 當前需要花費的金額
                                    // 因為double的加減乘除不精確
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber)).doubleValue();
                                    if(loginUser.getMoney() >= money) {
                                        System.out.println("您成功購買了" + movie.getName() + buyNumber + "張票");
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() - buyNumber);
                                        return;
                                    }else {
                                        System.out.printf("錢不夠，請問繼續購票嗎? y/n");
                                        String command = SYC_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的");
                                                return;
                                        }
                                    }

                                } else {
                                    System.out.println("您當前最多可以購買: " + movie.getNumber());
                                    System.out.printf("請問繼續購票嗎? y/n");
                                    String command = SYC_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的");
                                            return;
                                    }
                                }
                            }

                        } else {
                            System.out.println("電影名稱部隊");
                        }
                    }

                } else {
                    System.out.println("此電影院關門了");
                    System.out.printf("請問繼續購票嗎? y/n");
                    String command = SYC_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的");
                            return;
                    }
                }
            }
        }
    }

    public static Movie getMovieByShopAndName(Business business, String movieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName));
            return movie;
        }
        return null;
    }

    public static Business getUserByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    private static void showAllMovies() {
        System.out.println("========展示全部電影訊息============");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t電話: " + business.getPhone() + "\t\t地址: " + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t時長\t\t時常\t\t評分\t\t票價\t\t餘票數量\t\t放映時間");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getTime() + "\t\t" + movie.getScore()+ "\t\t"  + movie.getPrice()+ "\t\t"
                        + movie.getNumber()+ "\t\t" + sdf.format(movie.getStartTime()));

            }
        });
    }

    public static User geyUserByLoginName(String loginName) {
        for (User allUser : ALL_USERS) {
            if (allUser.getLoginName().equals(loginName)) {
                return allUser;
            }
        }
        return null;
    }
}
