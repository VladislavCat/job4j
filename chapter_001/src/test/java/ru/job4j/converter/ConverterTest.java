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
    /**
     *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в евро.
     */
    public void when70RubleToEuro() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(70));
    }
    @Test
    /**
     *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в доллары.
     */
    public void when60RubleToDollar() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(60));
    }
    @Test
    /**
     *Метод для проверки одноименного метода конвертера из основной программы, а именно Евро в рубли.
     */
    public void when60EuroToRuble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1 / 70);
        assertThat(result, is(1 / 70));
    }
    @Test
    /**
     *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в Доллары
     */
    public void when60RubleToEuro() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1 / 60);
        assertThat(result, is(1 / 60));
    }
}