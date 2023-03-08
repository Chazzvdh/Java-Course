import java.util.Scanner;

public class nested_loops {
    public static void main(String[] arg) {
        // nested loops = a loop inside of a loop

        Scanner scanner  = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter a symbol");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
        }
    }
}
