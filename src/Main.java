public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
        Duck duck = new Duck("Скрудж Мак Дак", 13.2,12);
        Dog dog = new Dog("Гуффи", 24.6,44);
        duck.walk();
        duck.move();
        dog.walk();
        dog.move();

    }
}
