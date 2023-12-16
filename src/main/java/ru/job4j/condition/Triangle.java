package ru.job4j.condition;

public class Triangle {
    public static  boolean exist(double ab, double ac, double bc) {
        boolean existA = (ab + ac) > bc;
        boolean existB = (ac + bc) > ab;
        boolean existC = (ab + bc) > ac;
        return existA && existB && existC;
    }

    public static boolean isFalse(double ab, double ac, double bc) {
        boolean existA = (ab + ac) > bc;
        boolean existB = (ac + bc) > ab;
        boolean existC = (ab + bc) > ac;
        return existA && existB && existC && ab > 0 && ac > 0 && bc > 0;
    }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
        System.out.println(isFalse(-2.0, 2.0, 2.0));
    }
}
