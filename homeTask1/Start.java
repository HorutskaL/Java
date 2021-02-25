public class Start {
    public static void main(String[] args) {

        //Агрегація
        Car car1 = new Car(1, "Nissan", 2005, "black", "diesel", 4, 180);
        System.out.println(car1);

        //Композиція
        Car car2 = new Car(2,"Opel", 2016, "green");
        Driver driver = new Driver(1, "Ivan", 25, "male", 7, car2);
        System.out.println(driver);
    }
}
