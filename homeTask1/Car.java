public class Car {
    private int id;
    private String model;
    private int year;
    private String color;
    private Engine engine;

    public Car() {
    }

    public Car(int id, String model, int year, String color) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(int id, String model, int year, String color, String type, int numberOfCylinders, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = new Engine(type, numberOfCylinders, maxSpeed);
    }

    public int getId() {
        return id;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
