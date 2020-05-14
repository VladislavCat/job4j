package ru.job4j.condition;
public class Max{
    public int max(int left, int right) {
        return left > right ? left : right;
    }
    public int max(int left, int right, int up) {
        int tmp = max(left, right);
        return max(tmp, up);
    }
    public int max(int left, int right, int up, int down) {
        int tmp = max(left, right);
        int tmp2 = max(up, down);
        return max(tmp, tmp2);
    }
}
