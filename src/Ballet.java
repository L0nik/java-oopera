public class Ballet extends MusicalShow {
    private Person choreographer;
    public Ballet(int duration, String title, Director director, String librettoText, Person musicAuthor, Person choreographer) {
        super(duration, title, director, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
