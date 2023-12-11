package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt(3 * (3 - a) * (3 - b) * (3 - c));
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2,2,2 = " + result);
    }
}
