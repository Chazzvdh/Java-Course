import java.util.Scanner;

public class if_statements {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        // if statement = performs a block of code if it's condition evaluates to be true
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if(age >= 75) {
            System.out.println("OK Boomer!");
        } else if(age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 10) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are a child!");
        }
    }
}
