import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] arg) {
        // for-each = traversing technique to iterate through the elements in an array

        String[] animals = {"Cat", "Dog", "Rat", "Bird"};

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Rat");
        animals2.add("Bird");

        for (String i : animals2) {
            System.out.println(i);
        }
    }
}
