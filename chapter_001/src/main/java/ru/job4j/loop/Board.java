package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int n = 0; n < height; n++) {
                /** условие проверки, что писать пробел или X
                * Выше в задании мы определили закономерность, когда нужно проставлять X
                 */
                if ((i + n) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            /**
             * добавляем перевод на новую строку.
             */
            screen.append(ln);
        }
        return screen.toString();
    }
}

