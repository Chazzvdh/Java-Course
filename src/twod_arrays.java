public class twod_arrays {
    public static void main(String[] arg) {
        String[][] names = new String[3][3];

        names[0][0] = "Benthe";
        names[0][1] = "Chazz";
        names[0][2] = "Martijn";

        names[1][0] = "Bram";
        names[1][1] = "Quinten";
        names[1][2] = "Jason";

        names[2][0] = "Waldo";
        names[2][1] = "Rachel";
        names[2][2] = "Dinnah";

        for (int i = 0; i < names.length; i++) {
            System.out.println();
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
        }

        String[][] cars = { {"Caramo", "Corvette", "Silverado"},
                            {"Mustang", "Ranger", "F-150"},
                            {"Ferarri", "Lambo", "Tesla"} };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
