package constructors;

public class Human {

    private String name;
    private int age;
    private double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
