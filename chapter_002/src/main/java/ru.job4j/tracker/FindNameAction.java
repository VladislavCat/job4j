package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Поиск заявки по имени: ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("==== Пожалуйста, введите имя заявки, которую хотите найти ====");
        Item[] resultName = tracker.findByName(key);
        for (int i = 0; i < resultName.length; i++) {
            Item item = resultName[i];
            System.out.println(item.getId() + " " + item.getName() + " " + item.toString());
        }
        return true;
    }
}
