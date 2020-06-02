package ru.job4j.tracker;

public class TrackerThree {
    private static final TrackerThree INSTANCE = new TrackerThree();
    private TrackerThree() {
    }

    public static TrackerThree getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle tracker = TrackerSingle.getInstance();
    }
}
