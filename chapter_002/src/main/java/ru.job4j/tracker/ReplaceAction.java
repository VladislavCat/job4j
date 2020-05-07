package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Изменение заявки ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите изменить ====");
        String name = input.askStr("==== Пожалуйста, введите новое имя заявки ====");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена");
        } else {
            System.out.println("Заявка не изменена");
        }
        return true;
    }
}
