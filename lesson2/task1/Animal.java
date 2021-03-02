package lesson2.task1;

public class Animal {
    private String name;
    private String group;

    public Animal() {

    }
    public Animal(String name, String group){
        this.name=name;
        this.group=group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String breed) {
        this.group = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + group + '\'' +
                '}';
    }
}
