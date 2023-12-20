package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FindLoop.indexOf(new int[]{5, 10, 3}, 5));
        System.out.println(FindLoop.indexOf(new int[]{4, 11, 8, 2}, 10));
        System.out.println(FindLoop.indexOf(new int[]{0, 3, 10, 8, 2}, 2));

    }
}
