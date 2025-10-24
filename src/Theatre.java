public class Theatre {

    public static void main(String[] args) {

        //создаем актеров, режиссеров, спектакли...
        Actor actor1 = new Actor("Том", "Хэнкс", Gender.MALE, 183);
        Actor actor2 = new Actor("Киану", "Ривз", Gender.MALE, 186);
        Actor actor3 = new Actor("Скарлетт", "Йоханссон", Gender.FEMALE, 160);
        Director director1 = new Director("Кристофер", "Кристофер", Gender.MALE, 123);
        Director director2 = new Director("Дени", "Вильнёв", Gender.MALE, 234);
        Person musicAuthor = new Person("Ганс", "Циммер", Gender.MALE);
        Person choreographer = new Person("Акрам", "Хан", Gender.MALE);
        Show show = new Show(135, "Звёздный час по местному времени", director1);
        Opera opera = new Opera(190, "Кармен", director1, "Либретто 'Кармен' тест", musicAuthor, 10);
        Ballet ballet = new Ballet(120,"Щелкунчик", director2, "Либретто 'Щелкунчик' тест", musicAuthor, choreographer);

        //распределяем актеров по спектаклям
        show.addActor(actor1);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        //выводим списки актеров
        show.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();

        //заменяем актера в опере и выводим новый список актеров
        opera.changeActor(actor3, actor2.getSurname());
        opera.printActors();
        System.out.println();

        //пробуем заменить несуществующего актера
        show.changeActor(actor2, "Кейдж");

        //вывод либретто
        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();
    }
}
