package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 1296);
        Book book2 = new Book("Мастер и Маргарита", 512);
        Book book3 = new Book("Идиот", 640);
        Book book4 = new Book("Clean code", 608);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("change books[0] -> books[3]");
        Book tm = books[0];
        books[0] = books[3];
        books[3] = tm;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Shown only books.name > Clean code");
        for (Book bk : books) {
            if (("Clean code").equals (bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }

    }
}
