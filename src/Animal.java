public abstract class Animal {
    private String name;
    private Double weight;
    private Integer age;

    public void walk() {
        System.out.println("Животное идет по земле");
    }
    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Animal(String name, Double weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Animal() {
    }
}
