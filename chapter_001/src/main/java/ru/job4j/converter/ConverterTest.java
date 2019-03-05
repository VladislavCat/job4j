package ru.job4j.converter;
/**
 *Добавляем аннотацию
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Открытие класса конвертер.тест
 */
public class ConverterTest
{
    @Test
/**
 *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в евро
 */
    public void when70RubleToEuro()
    {
        Converter Converter= new Converter();
        int result= Converter.RubleToEuro(60);
        assertThat(result, is(70));
    }
    @Test
/**
 *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в доллары.
 */
    public void when60RubleToDollar()
    {
        Converter Converter= new Converter();
        int result= Converter. RubleToDollar(70);
        assertThat(result, is(60));
    }
    @Test
/**
 *Метод для проверки одноименного метода конвертера из основной программы, а именно евро в рубли
 */
    public void when60EuroToRuble()
    {
        Converter Converter= new Converter();
        int result= Converter. EuroToRuble(1/70);
        assertThat(result, is(1/70));
    }
    @Test
/**
 *Метод для проверки одноименного метода конвертера из основной программы, а именно Рубли в Доллары
 */
    public void when60RubleToEuro()
    {
        Converter Converter= new Converter();
        int result= Converter. DollarToRuble(1/60);
        assertThat(result, is(1/60));
    }
}