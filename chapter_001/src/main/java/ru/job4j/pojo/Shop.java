package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Book novel = new Book("We", 200);
        Book roman = new Book("War and Peace", 2000);
        Book drama = new Book("The Storm", 120);
        Book journal = new Book("Clean Code", 30);

        Book[] books = new Book[7];
        books[0] = novel;
        books[1] = roman;
        books[2] = drama;
        books[3] = journal;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null) {
                System.out.println(book.getName() + " количество страниц в книге " + book.getNumberOfPages());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 2");
        //удаляем значение из ячейки с индексом 2
        books[2] = null;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null) {
                System.out.println(book.getName() + " количество страниц в книге " + book.getNumberOfPages());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 2 значение ячейки с индексом 3 и удаляем значение из ячейки с индексом 3");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if(book == null && i< books.length-1){
                books[i] = books[i + 1];
                books[i + 1] = null;
        }
            book = books[i];
            if (book != null) {
                System.out.println(book.getName() + " количество страниц в книге " + book.getNumberOfPages());
            } else if(book == null) {
                System.out.println("null");
            }
        }
    }
}



