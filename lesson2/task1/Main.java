package lesson2.task1;

public class Main {
//    Створити клас Тварина з двома довільними полями. від класу Тварина створити ще два нащадки , кожен з яких має свій
//    набір додаткових полів, від кожного нащядка ще по 2 нащадки, кожен з яких має додатково по одній характеристиці.
//    Створити по одному елементу кожного типу. Створити масив кожного типу, пофасувати всі елементи по можливих масивах,
//    які підходять їм за типом

    public static void main(String[] args) {
        Animal animal = new Animal("camel", "mammals");
        Pet pet1 = new Pet("grey", 2, "shepherd");
        Pet pet2 = new Pet("sonya", "mammal", "brown", 2,"Aly" );
        Dog dog1 = new Dog("black", 3, "bulldog", 4);
        Dog dog2 = new Dog("jek", "mammal","black", 3, "bulldog", 4);
        Cat cat1 = new Cat("marciza", "mammals", "white", 5, "siamese", "green");
        WildAnimal wildAnimal1 = new WildAnimal("elsa", "reptiles", "water", "carnivore", 60);
        Lion lion = new Lion("cat", "mammals", "savanna", "carnivore", 80, true);
        Hare hare = new Hare("zaya", "mammals", "Arctic", "herbivorous",75, "grey");

        Animal[] animals = new Animal[10];
        animals[0] = animal;
        animals[1] = pet1;
        animals[2] = pet2;
        animals[3] = dog1;
        animals[4] = dog2;
        animals[6] = cat1;
        animals[7] = wildAnimal1;
        animals[8] = lion;
        animals[9] = hare;


        Pet[] pets = new Pet[5];
        pets[0] = pet1;
        pets[1] = pet2;
        pets[2] = cat1;
        pets[3] = dog1;
        pets[4] = dog2;

        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;

        WildAnimal[] wildAnimals = new WildAnimal[3];
        wildAnimals[0] = wildAnimal1;
        wildAnimals[1] = lion;
        wildAnimals[2] = hare;

    }
}
