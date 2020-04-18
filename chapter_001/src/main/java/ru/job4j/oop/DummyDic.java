package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
    String txt = "Неизвестное слово" + eng;
    return txt;
}
    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String word = "Дефибрилятор";
        bot.engToRus(word);
    }
}
