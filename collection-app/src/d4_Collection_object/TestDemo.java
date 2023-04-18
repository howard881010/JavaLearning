package d4_Collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        Collection<Movie> movies= new ArrayList<>();
        movies.add(new Movie("aaa", 9, "aaaaaaa"));
        movies.add(new Movie("bbb", 9.5, "aaaasfs"));
        movies.add(new Movie("acccca", 7.9, "aasfsdfaaaaa"));

        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println("片名" + movie.getName());
            System.out.println("演員" + movie.getActor());
            System.out.println("得分" + movie.getScore());
        }
    }

}
