package Homework3;

public class Orange{
        String color;
        int price;
    public Orange(String color, int price) {
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}
