import java.util.Scanner;

public class while_loop {
    public static void main(String[] arg) {
        // while loop = executes a block of code as long as a condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());

        System.out.println("Hello " + name);
    }
}
