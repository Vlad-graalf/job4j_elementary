package ru.job4j.condition;


import static java.lang.Math.*;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(2, 1, 1, 1);
        System.out.println("result (2, 1) to (1, 1) " + result2);

        double result3 = Point.distance(-1, 2, -3, 1);
        System.out.println("result (-1, 2) to (-3, 1) " + result3);

        double result4 = Point.distance(2, 4, 7, 5);
        System.out.println("result (2, 4) to (7, 5) " + result4);

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
