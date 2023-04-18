package d10_genericity_limit;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<BMW> bmw = new ArrayList<>();
        bmw.add(new BMW());
        go(bmw);

        ArrayList<BENZ> benz = new ArrayList<>();
        benz.add(new BENZ());
        go(benz);

        ArrayList<DOG> dog = new ArrayList<>();
        dog.add(new DOG());
        // go(dog);  不能進去
    }
    public static void go(ArrayList<? extends Car> cars) {

    }
}

class DOG{

}

class BENZ extends Car{

}

class BMW extends Car {

}
