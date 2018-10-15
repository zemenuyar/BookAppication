package com.company;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Fiker eskemekabir ");
        book1.setAuthor("addis Alemayehu");
        book1.setPrice(50);
        book1.setInstock(5000);
        book1.setDescription("THIS IS THE BEST Book in Ethiopia");

        System.out.println(book1.getTitle());
        System.out.println(book1.toString());
    }
}
