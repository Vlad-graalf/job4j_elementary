package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double distance3(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double distance4(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance2(2, 1, 1, 1);
        System.out.println("result (2, 1) to (1, 1) " + result2);

        double result3 = Point.distance3(-1, 2, -3, 1);
        System.out.println("result (-1, 2) to (-3, 1) " + result3);

        double result4 = Point.distance4(2, 4, 7, 5);
        System.out.println("result (2, 4) to (7, 5) " + result4);
    }
}
