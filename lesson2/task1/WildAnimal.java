package lesson2.task1;

public class WildAnimal extends Animal{
    private String habitat;
    private String diet;
    private int speed;

    public WildAnimal() {
    }

    public WildAnimal(String habitat, String diet, int speed) {
        this.habitat = habitat;
        this.diet = diet;
        this.speed = speed;
    }

    public WildAnimal(String name, String group, String habitat, String diet, int speed) {
        super(name, group);
        this.habitat = habitat;
        this.diet = diet;
        this.speed = speed;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "habitat='" + habitat + '\'' +
                ", diet='" + diet + '\'' +
                ", speed=" + speed +
                "} " + super.toString();
    }
}
