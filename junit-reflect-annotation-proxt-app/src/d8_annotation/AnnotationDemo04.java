package d8_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo04 {
    @MyTest
    public void test1() {
        System.out.println("=====test1=======");
    }
    public void test2() {
        System.out.println("=====test2=======");
    }
    @MyTest
    public void test3() {
        System.out.println("=====test3=======");
    }
    /*
        啟動菜單，有註解的才被調用
     */
    public static void main(String[] args) throws Exception{
        AnnotationDemo04 t = new AnnotationDemo04();
        // 獲取類對象
        Class c = AnnotationDemo04.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                // 跑
                method.invoke(t);
            }
        }
    }
}
