package ru.job4j.pojo;

public class Library {
    public static void main(String[]args) {
        Book novel = new Book("We", 200);
        Book roman = new Book("War and Peace", 2000);
        Book drama = new Book("The Storm", 120);
        Book journal = new Book("Clean Code", 30);

        Book[] books = new Book[4];
        books[0] = journal;
        books[1] = roman;
        books[2] = drama;
        books[3] = novel;

        for (int index = 0; index < books.length; index++) {
        Book bk = books[index];
        System.out.println(bk.getName() + " количество страниц " + bk.getNumberOfPages());
        }

        Book bks = books[0];
        books[0] = books[3];
        books[3] = bks;
        System.out.println();
        System.out.println("Замена 1 и 4 ячейки");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " количество страниц " + bk.getNumberOfPages());
        }
            System.out.println();
            System.out.println("Удаление книги с названием Clean Code");
            for (int index = 0; index < books.length; index++) {
                Book bk = books[index];
                if (bk.getName().equals("Clean Code")) {
                    System.out.println(bk.getName() + " количество страниц " + bk.getNumberOfPages());
                }

        }
    }
}
