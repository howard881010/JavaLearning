package d1_set;

import java.util.Objects;

public class Apple implements Comparable<Apple>{
    private double price;
    private int weight;

    public Apple(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public Apple() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.price, price) == 0 && weight == apple.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public int compareTo(Apple o) {
        // 保留一樣的重量
        return this.weight - o.weight >= 0 ? 1 : -1;
        // 去掉一樣得重量
        //return this.weight - o.weight;
    }
}
