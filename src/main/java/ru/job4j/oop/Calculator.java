package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return x - a;
    }

    public int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int a) {
        return sum(10) + multiply(a) + divide(a) + minus(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("sum " + result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println("multiply " + rsl);
        int rsl1 = minus(5);
        System.out.println("minus " + rsl1);
        int rsl2 = calculator.divide(5);
        System.out.println("divide " + rsl2);
        int rsl3 = calculator.sumAllOperation(5);
        System.out.println("sumAllOperation " + rsl3);
    }
}