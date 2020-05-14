package ru.job4j.array;

public class SwithArray {
    public static int[] swap(int[] array, int source, int dest) {
        if (source < array.length && dest < array.length)    {
            int temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        }
            return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length];
        array[array.length] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}