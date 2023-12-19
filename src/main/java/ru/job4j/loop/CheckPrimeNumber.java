package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
        System.out.println(CheckPrimeNumber.check(4));
        System.out.println(CheckPrimeNumber.check(1));
        System.out.println(CheckPrimeNumber.check(11));
        System.out.println(CheckPrimeNumber.check(25));
        System.out.println(CheckPrimeNumber.check(9));
        System.out.println(CheckPrimeNumber.check(49));
    }
}