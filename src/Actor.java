import java.util.Objects;

class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + " см)";
    }
}