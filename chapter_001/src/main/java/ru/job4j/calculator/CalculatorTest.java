package ru.job4j.calculator;
/**
 * Выставляем аннотации
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Начинаем код программы тестера
 */
public class CalculatorTest  {
    @Test
    /**
     * Метод проверки метода сложения
     */
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    /**
     * Метод проверки метода вычитания
     */
    public void whenOddOneMinusOneThenZero(){
        Calculator calc = new Calculator();
        double result = calc.odd(1D,1D);
        double expected= 1D-1D;
        assertThat(result, is(expected));
    }
    @Test
    /**
     * Метод проверки метода умножения
     */
    public void whenEddOneMultiplyOneThen(){
        Calculator calc = new Calculator();
        double result = calc.edd(1D,1D);
        double expected= 1D*1D;
        assertThat(result, is(expected));
    }
    @Test
    /**
     * Метод проверки метода деления
     */
    public void whenDddOneDeleteOneThen(){
        Calculator calc = new Calculator();
        double result = calc.ddd(1D,1D);
        double expected=1D/1D;
        assertThat(result, is(expected));
    }
}