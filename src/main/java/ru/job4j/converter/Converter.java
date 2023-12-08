package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.printf("140 rubles are %.2f euro \n", euro);
        float dollar = Converter.rubleToDollar(140);
        System.out.printf("140 rubles are %.2f dollar", dollar);
    }
}
