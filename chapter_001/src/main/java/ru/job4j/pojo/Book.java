package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;

    }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }
        public int getNumberOfPages() {
            return numberOfPages;
        }


    }

