package org.example;

public class Main {
    public static void main(String[] args) {

        Book b= new Book();
        b.setBookName("Half GirlFriend");
        b.setAuthorName("Chethan Bhagath");
        b.setBookType("LoveStory");
        b.setBookLanguage("English");
        b.setBookPublishedYear(2017);

        Book b1= new Book();
        b1.setBookName("In Cold Blood");
        b1.setAuthorName("Truman");
        b1.setBookType("NonFiction");
        b1.setBookLanguage("English");
        b1.setBookPublishedYear(1995);

        System.out.println("BookName:"+ b.getBookName());
        System.out.println("BookType"+ b.getBookType());
        System.out.println("Author name:" +b.getAuthorName());
        System.out.println("Book Language:"+b.getBookLanguage());
        System.out.println("Book Published Year:" +b.getBookPublishedYear());
        System.out.println(" ");
        System.out.println("BookName:"+ b1.getBookName());
        System.out.println("BookType"+ b1.getBookType());
        System.out.println("Author name:" +b1.getAuthorName());
        System.out.println("Book Language:"+b1.getBookLanguage());
        System.out.println("Book Published Year:" +b1.getBookPublishedYear());
    }
}