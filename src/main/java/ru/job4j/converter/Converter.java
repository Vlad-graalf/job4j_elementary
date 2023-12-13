package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 120;
        float expected2 = 2;
        output = Converter.rubleToDollar(input);
        passed = expected2 == output;
        System.out.println("120 rubles are 2. Test result : " + passed);

        float euro = Converter.rubleToEuro(140);
        System.out.printf("140 rubles are %.2f euro \n", euro);
        float dollar = Converter.rubleToDollar(120);
        System.out.printf("120 rubles are %.2f dollar", dollar);
    }
}
