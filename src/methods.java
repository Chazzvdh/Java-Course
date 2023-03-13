public class methods {
    public static void main(String[] arg) {
        // method = a block of code that is executed whenever it is called upon
        String name = "Chazz";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + " You are " + age + " years old");
    }
}
