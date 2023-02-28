import java.util.Scanner;

public class math_class {
    public static void main(String[] arg)
    {
        double x = 3.14;
        double y = 10;
        double z;

        z = Math.max(x, y);
        System.out.println(z);

        z = Math.min(x, y);
        System.out.println(z);

        z = Math.abs(x);
        System.out.println(z);

        z = Math.round(x);
        System.out.println(z);

        z = Math.ceil(x);
        System.out.println(z);

        z = Math.floor(x);
        System.out.println(z);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        a = scanner.nextDouble();

        System.out.println("Enter side y: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }
}
