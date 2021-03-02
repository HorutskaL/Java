package lesson2.task2;

public class Papirus {
    private int year;

    public Papirus() {
    }

    public Papirus(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int age) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "age=" + year +
                '}';
    }
}
