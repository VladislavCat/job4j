package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenFindAllTracker(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        Item item2 = new Item("Test2");
        Item item3 = new Item("Test3");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect = {item, item2, item3};
        assertThat(tracker.findAll(), is(expect));
    }
    @Test
    public void whenFindByName(){
        Tracker tracker = new Tracker();
        Item item = new Item("Test3");
        Item item2 = new Item("Test2");
        Item item3 = new Item("Test3");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect ={item, item3};
        assertThat(tracker.findByName("Test3"), is(expect));

    }
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        tracker.add(item);
        String id=item.getId();
        assertThat(tracker.findById(id), is(item));
    }
    }
