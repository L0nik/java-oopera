import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
