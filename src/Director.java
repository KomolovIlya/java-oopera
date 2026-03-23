class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, String gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + " (поставил " + numberOfShows + " спектаклей)";
    }

}
