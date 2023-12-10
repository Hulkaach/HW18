public class Dog extends Animal {
    public void move(){
        System.out.println("Собака по кличке "+super.getName()+" бежит по земле");
    }
    public Dog(String name, Double weight, Integer age) {
        super(name, weight, age);
    }

    public Dog() {
    }
}
