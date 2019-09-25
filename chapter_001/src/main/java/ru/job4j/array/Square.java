package ru.job4j.array;
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < rst.length; n++) {
        rst[n] = (int) Math.pow(n + 1, 2);
        }
        return rst;
    }
}