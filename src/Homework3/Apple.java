package Homework3;

public class Apple {
    private String name;
    private int size;
public Apple(String name, int size) {
    this.name = name;
    this.size = size;
}

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
