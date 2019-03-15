package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TRGLNKTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
// Создаем объект треугольник.
        TRGLNK triangle = new TRGLNK();
// Вычисляем площадь.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
// Задаем ожидаемый результат.
        double expected = 2D;
//Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}