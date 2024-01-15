package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = (int) Math.pow(i, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(3);
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();
        int[] array2 = calculate(5);
        for (int i : array2) {
            System.out.println(i);
        }
    }
}
