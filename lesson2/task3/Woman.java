package lesson2.task3;

public class Woman implements WomanClothes{
    private String name;
    private int size;
    private String color;

    public Woman() {
    }

    public Woman(String name) {
        this.name = name;
    }

    public Woman(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWearWoman() {
        System.out.println("I'd like to put on "+ this.color + " dress");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
