public class swap_variables {
    public static void main(String[] arg)
    {
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
