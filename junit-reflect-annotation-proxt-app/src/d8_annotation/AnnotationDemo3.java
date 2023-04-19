package d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
    註解的解析
 */
public class AnnotationDemo3 {
    @Test
    public static void main(String[] args) throws Exception {
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        if(c.isAnnotationPresent(Book.class)) {
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }

        if(m.isAnnotationPresent(Book.class)) {
            Book book = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }


    }
}
@Book(value = "aaaa", price= 99.9, authors = {"aaa", "bbb"})
class BookStore{
    @Book(value = "fff", price= 99.9, authors = {"cc", "dd"})
    public void test(){

    }

}
