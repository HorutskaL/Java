package lesson2.task1;

public class Lion extends WildAnimal{
    private boolean isLeader;

    public Lion() {
    }

    public Lion(String name, String group, String habitat, String diet, int speed, boolean isLeader) {
        super(name, group, habitat, diet, speed);
        this.isLeader = isLeader;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "isLeader=" + isLeader +
                "} " + super.toString();
    }
}
