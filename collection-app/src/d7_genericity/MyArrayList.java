package d7_genericity;

import java.util.ArrayList;

public class MyArrayList<E>{
    private ArrayList lists = new ArrayList();
    public void add(E e){
        lists.add(e);
    }
    public void remove(E e){
        lists.remove(e);

    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
