package org.modul_4.tugas.books;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;
    public Book(String bookId, String title, String author, String category, int stock){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
    }
    public void setBookId(String bookId){
        this.bookId = bookId;
    }
    public String getBookId(){
        return bookId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        return stock;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
}
