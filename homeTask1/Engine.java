public class Engine {
    public String type;
    private int numberOfCylinders;
    private int maxSpeed;

    public Engine(){
    }
    public Engine(String type, int numberOfCylinders, int maxSpeed){
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
        this.maxSpeed = maxSpeed;
    }
    public String getType(){
        return type;
    }
    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setNumberOfCylinders(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                ", type='" + type + '\'' +
                ", numberOfCylinders=" + numberOfCylinders +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
