package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "==== Удаление заявки: ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("==== Пожалуйста, введите ID заявки, которую хотите удалить ====");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка не удалена");
        }
        return false;
    }
}
