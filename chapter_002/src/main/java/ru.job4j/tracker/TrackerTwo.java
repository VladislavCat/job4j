package ru.job4j.tracker;

public enum TrackerTwo {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }
    public static void main(String[] args) {
        TrackerTwo tracker = TrackerTwo.INSTANCE;
    }
}