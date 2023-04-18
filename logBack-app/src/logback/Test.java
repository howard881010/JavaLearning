package logback;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/*
    快速搭建logback，紀錄系統的日誌信息
 */
public class Test {
    // 創建logback的日誌對象，代表了日誌技術
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法開始執行了");
            LOGGER.info("我開始記錄第二行");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);
            System.out.println(a/b);
        } catch (Exception e) {
            LOGGER.error("功能出現異常" + e);
            throw new RuntimeException(e);
        }

    }
}
