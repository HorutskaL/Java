package lesson2.task2;

public class Main {

//    Cтворити клас ланцюг наслідування:
//    Папірус-Кинга-Журнал
//    Папірус-Книга-Комікс
//    Кількість полів довільна.

    public static void main(String[] args) {

        Papirus papirus = new Papirus(1002);
        Book book = new Book(2018, "fiction", true, 288);
        Comics comics = new Comics(2020, "Horror", false, 32, "sketch");
        Magazine magazine = new Magazine(2020, "scientist", true, 42, 6);
    }
}
