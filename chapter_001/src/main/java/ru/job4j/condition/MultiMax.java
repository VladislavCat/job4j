package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (first == second && first == third && second == third) {
            return result;
        } else {
            result = first > second ? first : second;
            return result = result > third ? result : third;
        }
    }
}