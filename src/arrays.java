public class arrays {
    public static void main(String[] arg) {
        // array = used to store multiple values in a single variable

        String[] names = {"Benthe", "Chazz", "Martijn"};

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }


        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
