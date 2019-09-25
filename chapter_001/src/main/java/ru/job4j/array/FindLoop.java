package ru.job4j.array;
public class FindLoop {
    public int indexOf(int[] data, int el) {
        /**
         * Если элемента нет в массиве возвращаем -1
         */
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}