package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI.replaceBid(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item= new Item("newItem1");
        Item item2= new Item("newItem2");
        tracker.add(item);
        tracker.add(item2);
        String[] answers = {
                item.getId()
        };
        StartUI.deleteBid(tracker, new StubInput(answers));
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted.getName(), is("null") );
    }
}