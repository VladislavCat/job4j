package ru.job4j.tracker;

public class AllItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Демонстрация всех заявок ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " " + item.getName());
            System.out.println(item);
        }
        return true;
    }
}
