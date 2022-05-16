package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет в Магадан");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("В автобусе находятся: " + quantity + " пассажиров.");
    }

    @Override
    public int refuel(int fuel) {
        return 15 * fuel;
    }
}
