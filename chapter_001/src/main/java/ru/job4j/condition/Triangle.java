package ru.job4j.condition;
public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return rsl;
        }
    }
    private boolean exist(double a, double c, double b) {
        return a + b > c && b + c > a && a + c > b;
    }
}

