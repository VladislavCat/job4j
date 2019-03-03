package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenOddOneMinusOneThenZero(){
        Calculator calc = new Calculator();
        double result = calc.odd(1D,1D);
        double expected= 1D-1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenEddOneMultiplyOneThen(){
        Calculator calc = new Calculator();
        double result = calc.edd(1D,1D);
        double expected= 1D*1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDddOneDeleteOneThen(){
        Calculator calc = new Calculator();
        double result = calc.ddd(1D,1D);
        double expected=1D/1D;
        assertThat(result, is(expected));
    }
}