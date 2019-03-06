package ru.job4j.converter;
/**
 *Конвертер валюты
 */
public class Converter {
    public int rubleToEuro(int value) {
        /**
         *Метод для перевода рублей в евро
         */
        return 70;
    }
    public int rubleToDollar(int value) {
        /**
         *Метод для перевода рублей в доллары
         */
        return 60;
    }
    public int euroToRuble(int value) {
        /**
         *Метода для перевода евро в рубли
         */
        return  1 / 70;
    }
    public int dollarToRuble(int value) {
        /**
         *Метод для перевода доллары в евро
         */
        return 1 / 60;
    }
}