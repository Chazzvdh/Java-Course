package OOP2;

public class Muziek {
    private String genre;
    private int hJaar;
    private int bpm;
    private genreCreator creator;

    public Muziek(String genre, int year, int bpm, genreCreator creator) {
        this.genre = genre;
        this.hJaar = year;
        this.bpm = bpm;
        this.creator = creator;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return hJaar;
    }

    public int getBpm() {
        return bpm;
    }

    public genreCreator getCreator() {
        return creator;
    }

    public String toString() {
        return String.format("Genre: %s\nHerkomst jaar: %d\nbpm: %d\n", genre, hJaar, bpm);
    }
}
