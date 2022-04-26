package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item(1, "bug");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        System.out.println(item1);
    }
}
