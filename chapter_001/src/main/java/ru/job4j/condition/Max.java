package ru.job4j.condition;

/**
 * Метод для проверки наибольшего числа
 */
public class Max {
    public int max(int left, int right) {
        return left < right ? left : right;
    }
}