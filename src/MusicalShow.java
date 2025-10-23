public class MusicalShow extends Show {
    private String librettoText;
    private final Person musicAuthor;

    public MusicalShow(int duration, String title, Director director, String librettoText, Person musicAuthor) {
        super(duration, title, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println(this.librettoText);
    }
}
