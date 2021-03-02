package lesson2.task2;

public class Book extends Papirus{
    private String genre;
    private boolean isPrinted;
    private int numberPages;

    public Book() {
    }

    public Book(int year, String genre, boolean isPrinted, int numberPages) {
        super(year);
        this.genre = genre;
        this.isPrinted = isPrinted;
        this.numberPages = numberPages;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrinted(boolean printed) {
        isPrinted = printed;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", isPrinted=" + isPrinted +
                ", numberPages=" + numberPages +
                "} " + super.toString();
    }
}
