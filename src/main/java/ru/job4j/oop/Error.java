package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("active " + active);
        System.out.println("status " + status);
        System.out.println("message " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true,34,"Парам-парам");
        Error error2 = new Error(false,20,"Пурум-пурум");
        Error error3 = new Error();
        error.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
