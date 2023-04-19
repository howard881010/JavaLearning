package d5_reflectMethod;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodDemo01 {
    @Test
    public void getDeclaredMethods() {
        Class c = Dog.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "返回值類型=>" + method.getReturnType() + "參數個數=>" + method.getParameterCount());
        }
    }

    @Test
    public void getDeclaredMethod() throws Exception{
        Class c = Dog.class;
        Method method = c.getDeclaredMethod("eat");
        Method method1 = c.getDeclaredMethod("eat", String.class);

//        System.out.println(method.getName() + "返回值類型=>" + method.getReturnType() + "參數個數=>" + method.getParameterCount());
//        System.out.println(method1.getName() + "返回值類型=>" + method1.getReturnType() + "參數個數=>" + method1.getParameterCount());
        Dog d = new Dog();
        method.setAccessible(true);
        Object result = method.invoke(d);
        System.out.println(result);

        method1.setAccessible(true);
        Object result2 = method1.invoke(d, "骨頭");
        System.out.println(result2);

    }

}
