public class Opera extends MusicalShow {
    private int choirSize;
    public Opera(int duration, String title, Director director, String librettoText, Person musicAuthor, int choirSize) {
        super(duration, title, director, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
