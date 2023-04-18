package d2_byte_buffer_time;

import java.io.*;

public class ByteBufferTimeDemo01 {
    private static final String SRC_FILE = "C:\\Users\\user\\OneDrive\\桌面\\pexels-photo-747964-scaled.jpeg";
    private static final String DST_FILE = "D:\\resource\\";

    public static void main(String[] args) {
        copy01();
        copy02();
        copy03();
        copy04();
    }

    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DST_FILE + "a1.jpeg");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            int code;
            while ((code = bis.read()) != -1) {
                bos.write(code);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用緩沖的字節流複製耗時: " + (endTime - startTime) / 1000 + "s");
    }

    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DST_FILE + "a2.jpeg");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用緩沖的字符流複製耗時: " + (endTime - startTime) / 1000 + "s");
    }

    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DST_FILE + "a3.jpeg");
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低級的字符流複製耗時: " + (endTime - startTime) / 1000 + "s");
    }

    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DST_FILE + "a4.jpeg");
        ) {
            int code;
            while ((code = is.read()) != -1) {
                os.write(code);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低級的字節流複製耗時: " + (endTime - startTime) / 1000 + "s");
    }

}
