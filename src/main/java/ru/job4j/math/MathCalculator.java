package ru.job4j.math;
import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double sumAndMinus(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.minus(first, second);
    }

    public static double divisionAndMultiply(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double divisionAndMinus(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.minus(first, second);
    }

    public static double divisionAndMinusAndSumAndMultiply(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.minus(first, second)
                + MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMinus(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndMinus(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndMinusAndSumAndMultiply(10, 20));
    }
}
