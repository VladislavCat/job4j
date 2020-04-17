package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                this.showMenu();
            } else if (select == 1) {
                    System.out.println("==== Все заявки: ====");
                    Item[] arrayWithoutNull = tracker.findAll();
                    for (int i = 0; i < arrayWithoutNull.length; i++) {
                        Item item = arrayWithoutNull[i];
                        System.out.println(item);
                    }
            } else if (select == 2) {
                System.out.println("==== Изменение заявки: ====");
                System.out.println("==== Пожалуйста, введите ID заявки, которую хотите изменить ====");
                String id = scanner.nextLine();
                System.out.println("==== Пожалуйста, введите новое имя заявки ====");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена");
                } else {
                    System.out.println("Заявка не изменена");
                }
                this.showMenu();
            } else if (select == 3) {
                System.out.println("==== Удаление заявки: ====");
                System.out.println("==== Пожалуйста, введите ID заявки, которую хотите удалить ====");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена");
                } else {
                    System.out.println("Заявка не удалена");
                }
                this.showMenu();
            } else if (select == 4) {
                System.out.println("==== Поиск заявки по ID: ====");
                System.out.println("==== Пожалуйста, введите ID заявки, которую хотите найти ====");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item.equals(null)) {
                    System.out.println("==== Такая заявка отсуствует ====");
                } else {
                    System.out.println("==== Это заявка ====");
                    System.out.println(item.getName());
                }
                this.showMenu();
        } else if (select == 5) {
        System.out.println("==== Поиск заявки по имени: ====");
        System.out.println("==== Пожалуйста, введите имя заявки, которую хотите найти ====");
        String key = scanner.nextLine();
        Item[] resultName = tracker.findByName(key);
        for (int i = 0; i < resultName.length; i++) {
            Item item = resultName[i];
            System.out.println(item);
        }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}


