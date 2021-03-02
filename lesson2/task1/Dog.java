package lesson2.task1;

public class Dog extends Pet{
    private int angerLevel;

    public Dog() {
    }

    public Dog(String color, int age, String breed, int angerLevel) {
        super(color, age, breed);
        this.angerLevel = angerLevel;
    }

    public Dog(String name, String group, String color, int age, String breed, int angerLevel) {
        super(name, group, color, age, breed);
        this.angerLevel = angerLevel;
    }

    public int getAngerLevel() {
        return angerLevel;
    }

    public void setAngerLevel(int angerLevel) {
        this.angerLevel = angerLevel;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "angerLevel=" + angerLevel +
                "} " + super.toString();
    }
}
