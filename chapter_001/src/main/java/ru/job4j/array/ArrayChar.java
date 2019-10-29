package ru.job4j.array;
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index < data.length; index++) {
        if (data[index] == value[index]) {
            result = true;
        } else {
            result = false;
        }
        }
        return result;
    }
}