package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ====");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);

    }
    public static void allBid(Tracker tracker) {
        System.out.println("=== Демонстрация всех заявок ====");
        Item[] arrayWithoutNull = tracker.findAll();
        for (int i = 0; i < arrayWithoutNull.length; i++) {
            Item item = arrayWithoutNull[i];
            System.out.println(item);
        }
    }
    public static void replaceBic(Tracker tracker, Input input) {
        System.out.println("=== Изменение заявки ====");
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите изменить ====");
        String name = input.askStr("==== Пожалуйста, введите новое имя заявки ====");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена");
        } else {
            System.out.println("Заявка не изменена");
        }
    }
    public static void deleteBid(Tracker tracker, Input input) {
        System.out.println("==== Удаление заявки: ====");
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите удалить ====");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка не удалена");
        }
    }
    public static void findBidId(Tracker tracker, Input input) {
        System.out.println("==== Поиск заявки по ID: ====");
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите найти ====");
        if (tracker.findById(id).equals(null)) {
            System.out.println("==== Такая заявка отсуствует ====");
        } else {
            System.out.println("==== Это заявка ====");
            System.out.println(tracker.findById(id));
        }
    }
        public static void findBidName(Tracker tracker, Input input) {
            System.out.println("==== Поиск заявки по имени: ====");
            String key = input.askStr("==== Пожалуйста, введите имя заявки, которую хотите найти ====");
            Item[] resultName = tracker.findByName(key);
            for (int i = 0; i < resultName.length; i++) {
                Item item = resultName[i];
                System.out.println(item);
            }
        }


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allBid(tracker);
                } else if (select == 2) {
                StartUI.replaceBic(tracker, input);
            } else if (select == 3) {
                StartUI.deleteBid(tracker, input);
            } else if (select == 4) {
                StartUI.findBidId(tracker, input);
        } else if (select == 5) {
          StartUI.findBidName(tracker, input);
            } else if (select == 6) {

            run = false;

        }
        }
    }


    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0.Добавить новую заявку.");
        System.out.println("1.Показать все заявки.");
        System.out.println("2.Изменить заявку.");
        System.out.println("3.Удалить заявку.");
        System.out.println("4.Найти заявку по ID.");
        System.out.println("5.Найти заявку по имени.");
        System.out.println("6.Выйти из программы.");
        System.out.println("Выберите пункт меню");
    }



    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);

    }
}


