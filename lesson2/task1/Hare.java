package lesson2.task1;

public class Hare extends WildAnimal{
    private String color;

    public Hare() {
    }

    public Hare(String name, String group, String habitat, String diet, int speed, String color) {
        super(name, group, habitat, diet, speed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hare{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
