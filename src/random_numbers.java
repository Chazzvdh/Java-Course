import java.util.Random;

public class random_numbers {
    public static void main(String[] arg)
    {
        Random random = new Random();

        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
