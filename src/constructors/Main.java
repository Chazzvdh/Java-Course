package constructors;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human1.getName());
        System.out.println(human2.getName());
    }
}
