package ru.job4j.oop;

public class Calculator {
    private static final int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(10) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println("sum " + result);
        result = calculator.multiply(5);
        System.out.println("multiply " + result );
        result = minus(5);
        System.out.println("minus " + result );
        result = calculator.divide(5);
        System.out.println("divide " + result );
        result = calculator.sumAllOperation(5);
        System.out.println("sumAllOperation " + result );
    }
}