package ru.job4j.oop;

public class Animal {
    public Animal(String name){
        System.out.println("Animal");
    }
    public Animal(){
        System.out.println("Animal");
    }
    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}

