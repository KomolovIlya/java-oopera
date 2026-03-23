import java.util.ArrayList;

class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

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
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ошибка: Актер с фамилией " + oldSurname + " не найден в спектакле '" + title + "'.");
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