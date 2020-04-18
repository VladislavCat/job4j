package ru.job4j.poly;

public interface Transport {
    String ride();
    int passenger(int numPassenger);
    int fuel(int numFuel);
}
