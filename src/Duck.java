public class Duck extends Animal {
    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }

    public Duck(String name, Double weight, Integer age) {
        super(name, weight, age);
    }

    public Duck() {
    }
}
