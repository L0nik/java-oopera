import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(int duration, String title, Director director) {
        this.duration = duration;
        this.title = title;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.printf("Режиссер спектакля '%s': %s\n", this.title, this.director);
    }

    public void printActors() {
        System.out.printf("Список актеров спектакля '%s':\n", this.title);
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (this.listOfActors.contains(actor))
            System.out.printf("Актер '%s' уже учавствует в спектакле '%s'\n", actor, this.title);
        else
            this.listOfActors.add(actor);
    }

    public void changeActor(Actor newActor, String oldActorSurname) {
        int indexOfOldActor = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(oldActorSurname)) {
                indexOfOldActor = i;
                break;
            }
        }
        if (indexOfOldActor == -1)
            System.out.printf(
                    "Не удалось заменить актера: актер с фамилией '%s' не учавствует в спектакле '%s'\n",
                    oldActorSurname,
                    this.title
            );
        else
            listOfActors.set(indexOfOldActor, newActor);
    }
}
