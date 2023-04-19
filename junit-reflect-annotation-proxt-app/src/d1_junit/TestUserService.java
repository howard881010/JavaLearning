package d1_junit;

import org.junit.*;

public class TestUserService {

    @Before
    public void before() {
        System.out.println("=====Before方法執行一次");
    }

    @After
    public void after() {
        System.out.println("=====after方法執行一次");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("=====BeforeClass方法執行一次");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("=====afterClass方法執行一次");
    }
    @Test
    public void testLoginName() {
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");

        // 進行預期結果的正確性測試
        Assert.assertEquals("您的功能業務可能出錯", "login success", rs);

    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }
}
