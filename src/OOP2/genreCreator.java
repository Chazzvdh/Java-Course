package OOP2;

public class genreCreator {
    private String name;
    private int yearOfBirth;

    public genreCreator(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
