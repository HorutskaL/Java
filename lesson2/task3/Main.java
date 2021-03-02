package lesson2.task3;

public class Main {
//    Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".
//    Реалізувати їх у відповідних класах реалізаторах

    public static void main(String[] args) {

    Man man = new Man("Ostap", 46, "grey");
    man.doWearMan();

    Woman woman = new Woman("Olga", 44, "green");
    woman.doWearWoman();
    }
}
