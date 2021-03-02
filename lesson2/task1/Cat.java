package lesson2.task1;

public class Cat extends Pet{
    private String eyeColor;

    public Cat() {
    }

    public Cat(String name, String group, String color, int age, String breed, String eyeColor) {
        super(name, group, color, age, breed);
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyeColor='" + eyeColor + '\'' +
                "} " + super.toString();
    }
}
