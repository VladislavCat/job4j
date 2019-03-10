package ru.job4j.calculator;

/**
 * Программа для расчета идеального веса
 */
public class Fit {
    /**
     * Идеальный вес для мужчины
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double manWeight(double height) {
        return (180 - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины
     * @param height Рост.
     * @return Идеальный Вес.
     */
    public double womanWeight(double height) {
        return (170 - 110) * 1.15;
    }

    }

