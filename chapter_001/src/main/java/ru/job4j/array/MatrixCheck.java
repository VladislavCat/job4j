

package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int j = data.length - 1;
       for (int i = 0; i < data.length; i++) {
           int n = i;
           if (data[0][0] != data[i][n] || data[data.length - 1][0] != data[j][i]) {
               result = false;
           }
           j--;
        }
        return result;
    }
}

