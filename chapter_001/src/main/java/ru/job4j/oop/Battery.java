package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        this.load = another.load + this.load;
        another.load = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(3000);
        Battery second = new Battery(1500);
        System.out.println("first.load : " + first.load + " second.load : " + second.load);
        second.exchange(first);
        System.out.println("first.load : " + first.load + " second.load : " + second.load);
    }
}
