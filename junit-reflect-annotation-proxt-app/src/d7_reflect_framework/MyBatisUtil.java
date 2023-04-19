package d7_reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MyBatisUtil {
    public static void save(Object obj){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\user\\IdeaProjects\\junit-reflect-annotation-proxt-app\\src\\data.txt", true));
            Class c = obj.getClass();
            // getSimpleName 拿類名  getName 拿包名加類名
            ps.println("=====" + c.getSimpleName() + "=====");
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);

            }
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
