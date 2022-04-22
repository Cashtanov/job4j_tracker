package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Петухов Илья Станиславович");
        student.setGroup("44p");
        student.setReceiptDate(new Date());
        System.out.println(student.getFullName() + " entered the " + student.getGroup() + " : " + student.getReceiptDate());
    }
}