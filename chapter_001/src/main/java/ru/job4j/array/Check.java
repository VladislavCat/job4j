package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++) {
            int index = i - 1;
            if (data[i] == true && data[index] == true) {
                result = true;
            } else if (data[i] == false && data[index] == false){
                result = true;
            } else {
                result=false;
            }
        }
        return result;
    }
}