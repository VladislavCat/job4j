package ru.job4j.tracker;

public class AllItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Демонстрация всех заявок ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] arrayWithoutNull = tracker.findAll();
        for (int i = 0; i < arrayWithoutNull.length; i++) {
            Item item = arrayWithoutNull[i];
            System.out.println(item);
        }
        return true;
    }
}
