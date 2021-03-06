package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    /**
     * Метод для проверки второго числа, как большей величины
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Метод для проверки первого числа, как большей величины
     */
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1To3Then3() {
        Max max = new Max();
        int result = max.max(2, 1, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax1To2To3To4Then4() {
        Max max = new Max();
        int result = max.max(2, 1, 4, 8);
        assertThat(result, is(8));
    }
}
