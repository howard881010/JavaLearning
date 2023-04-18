package d4_collection_test;

public class Card{
    private String size;
    private String color;
    private int index;  // 牌的大小

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Card() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size + color;
    }
}
