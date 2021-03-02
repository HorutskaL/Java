package lesson2.task2;

public class Magazine extends Book{
    private int period;

    public Magazine() {
    }

    public Magazine(int age, String genre, boolean isPrinted, int numberPages, int period) {
        super(age, genre, isPrinted, numberPages);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "period=" + period +
                "} " + super.toString();
    }
}
