public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Дальвин", "Щербаков", Gender.MALE, 180);
        Actor actor2 = new Actor("Елена", "Образцова", Gender.FEMALE, 172);
        Actor actor3 = new Actor("Николай", "Цискаридзе", Gender.MALE, 183);

        Director director1 = new Director("Юрий", "Любимов", Gender.MALE, 60);
        Director director2 = new Director("Франко", "Дзеффирелли", Gender.MALE, 70);

        String musicAuthor = "Жорж Бизе";
        String choreographer = "Юрий Григорович";

        Show drama = new Show("Мастер и Маргарита", 150, director1);

        Opera opera = new Opera("Кармен", 190, director2,
                musicAuthor, "История цыганки и солдата в Севилье...", 50);

        Ballet ballet = new Ballet("Щелкунчик", 130, director1,
                "Пётр Чайковский", "Рождественская сказка о деревянном после...", choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("--- ИНФОРМАЦИЯ О ПОСТАНОВКАХ ---");
        drama.printDirector();
        drama.printActorsList();

        System.out.println();
        opera.printDirector();
        opera.printActorsList();

        System.out.println();
        ballet.printDirector();
        ballet.printActorsList();

        System.out.println("\n--- Замена актера ---");
        drama.replaceActor("Образцова", actor3);
        drama.printActorsList();

        System.out.println("\n--- Проверка ошибки ---");
        opera.replaceActor("Бондарчук", actor1);

        System.out.println("\n--- Детали музыкальных спектаклей ---");
        opera.printLibretto();
        opera.printOperaInfo();

        System.out.println();
        ballet.printLibretto();
        ballet.printChoreographer();
    }
}