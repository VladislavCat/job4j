package ru.job4j.converter;
/**
 *Конвертер валюты
 */
public class Converter {
    /**
     *Метод для перевода рублей в евро
     */
    public int rubleToEuro(int value) {
        return value * 70;
    }
    /**
     *Метод для перевода рублей в доллары
     */
    public int rubleToDollar(int value) {
        return value * 60;
    }
    /**
     *Метод для перевода евро в рубли
     */
    public int euroToRuble(int value) {
        return  value / 70;
    }
    /**
     *Метод для перевода доллары в евро
     */
    public int dollarToRuble(int value) {
        return value / 60;
    }
}