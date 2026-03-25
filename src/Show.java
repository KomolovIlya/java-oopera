import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: Актер " + newActor.name + " уже в составе спектакля '" + title + "'.");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(String oldSurname, Actor newActor) {
        int count = 0;
        int indexToReplace = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                count++;
                indexToReplace = i;
            }
        }

        if (count == 0) {
            System.out.println("Ошибка: Актер с фамилией " + oldSurname + " не найден в спектакле '" + title + "'.");
        } else if (count > 1) {
            System.out.println("Ошибка: Найдено несколько актеров с фамилией " + oldSurname + ". Замена не выполнена.");
        } else {
            listOfActors.set(indexToReplace, newActor);
            System.out.println("Актер с фамилией " + oldSurname + " успешно заменен на " + newActor.getSurname() + ".");
        }
    }

    public void printActorsList() {
        System.out.println("Актеры спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    public void printDirector() {
        System.out.println("Режиссер: " + director);
    }
}