package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Открываем класс
 */
public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point a = new Point(1, 2);
        Point b = new Point(1, 4);
        double result = a.distance(b);
        assertThat(result, is(2D));
    }
}