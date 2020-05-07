package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "==== Поиск заявки по ID: ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите найти ====");
        Item item = tracker.findById(id);
        if (item.equals(null)) {
            System.out.println("==== Такая заявка отсуствует ====");
        } else {
            System.out.println("==== Это заявка ====");
            System.out.println(item);
        }
        return true;
    }
}
