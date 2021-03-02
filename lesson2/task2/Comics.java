package lesson2.task2;

public class Comics extends Book{
    private String drawStyle;

    public Comics() {
    }

    public Comics(int age, String genre, boolean isPrinted, int numberPages, String drawStyle) {
        super(age, genre, isPrinted, numberPages);
        this.drawStyle = drawStyle;
    }

    public String getDrawStyle() {
        return drawStyle;
    }

    public void setDrawStyle(String drawStyle) {
        this.drawStyle = drawStyle;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "drawStyle='" + drawStyle + '\'' +
                "} " + super.toString();
    }
}
