package lesson2.task1;

public class Pet extends Animal{
    private String color;
    private int age;
    private String breed;

    public Pet() {
    }

    public Pet(String color, int age, String breed) {
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public Pet(String name, String group, String color, int age, String breed) {
        super(name, group);
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
