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
            result = data[index] == value[index];
        }
        return result;
    }
}