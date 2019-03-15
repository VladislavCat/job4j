package ru.job4j.condition;

public class Triangle {

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c)
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Перимент.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод для вычисления площади
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, a);
        if (this.exist(a, b, a)) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return -1;
        }
    }

    /**
     *Метод для проверки возможности существования данного треугольника
     */
        private boolean exist(double a, double c, double b) {
            return a + b > c && b + c > a && a + c > b;
        }
    }