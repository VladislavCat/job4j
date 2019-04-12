package ru.job4j.array;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int r = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int n = 1; n < array.length; n++) {
                String tmp;
                if (array[i] == array[n]) {
                    tmp = array[i];
                    array[i] = array[r];
                    array[r] = tmp;
                    r--;
                }
            }
        }
        return array;
    }
}