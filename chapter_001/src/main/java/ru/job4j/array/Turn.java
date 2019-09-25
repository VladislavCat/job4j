package ru.job4j.array;
public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0 && array.length / 2 != i) {
                int index = array.length - i - 1;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            } else {
                if (array.length % 2 != 0 && (int) Math.ceil(array.length / 2)  != i) {
                    int index = array.length - i - 1;
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}

