package ru.job4j.converter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Добавляем аннотацию
 */
public class ConverterTest {
        /**
         * Открытие класса конвертер.тест
         */

    @Test
    public void when70RubleToEuro() {
        /**
         *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в евро
         */
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(70));
    }
    @Test
    public void when60RubleToDollar() {
        /**
         *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в доллары.
         */
        Converter converter = new Converter();
        int result = converter.rubleToDollar(70);
        assertThat(result, is(60));
    }
    @Test
    public void when60EuroToRuble() {
/**
 *Метод для проверки одноименного метода конвертера из основной программы, а именно Евро в рубли.
 */
        Converter converter = new Converter();
        int result = converter.euroToRuble(1 / 70);
        assertThat(result, is(1 / 70));
    }
    @Test

    public void when60RubleToEuro() {
        /**
         *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в Доллары
         */
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1 / 60);
        assertThat(result, is(1 / 60));
    }
}