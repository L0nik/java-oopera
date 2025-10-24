import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Actor actor = (Actor) o;
        return Objects.equals(this.name, actor.name) &&
                Objects.equals(this.surname, actor.surname) &&
                this.height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname, this.height);
    }
}
