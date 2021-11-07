package com.gcsdata;

import com.gcsdata.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Book book1 = new Book("O Gato que cai!", 300);
        System.out.println(book1);

    }
}

class Book {
    private String name;
    private Integer numberPages;

    public Book(String name, Integer numberPages) {
        this.name = name;
        this.numberPages = numberPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }
}