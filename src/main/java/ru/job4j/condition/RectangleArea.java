package ru.job4j.condition;

public class RectangleArea {

    public static double square(int p, double k) {
        return p * k;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 4, real = " + result);

        result = RectangleArea.square(2, 8);
        System.out.println(" p = 2, k = 8, s = 16, real = " + result);

        result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 12, real = " + result);
    }
}
