package ru.job4j.condition;
/**
 * @author Владислав Котов
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Открываем метод для обработки входящих слов, на определенные слова он будет отвечать.
     *      *ы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            System.out.println("Привет, умник.");
        } else if ("Пока.".equals(question)) {
            System.out.println("До скорой встречи.");
        }
        return rsl;
    }
}