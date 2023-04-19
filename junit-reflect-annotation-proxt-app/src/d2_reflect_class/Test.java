package d2_reflect_class;
/*
    反射的第一步:獲取class對象
 */

public class Test {
    public static void main(String[] args) throws Exception {
        // 1. Class類中的一個靜態方法: forName(全限名)
        Class c = Class.forName("d2_reflect_class.Student");
        System.out.println(c);

        // 2.類名class
        Class c1 = Student.class;
        System.out.println(c1);

        // 3. 對象.getClass() 獲取對象對應類的Class對象
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }
}
