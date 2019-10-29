package ru.job4j.oop;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }
    public Predator() {
        super();
        System.out.println("Predator");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
