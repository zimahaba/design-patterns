package edu.zimahaba.designpatterns.behavioral.observer;

public class Book {

    private Integer id;
    private String name;
    private String author;
    private boolean available;

    private Publisher publisher;

    public Book(Integer id, String name, String author, boolean available) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.available = available;
        publisher = Publisher.getInstance();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available) {
            publisher.notify(this);
        }
    }

    public void alertMeWhenAvailable(Notifiable client) {
        publisher.subscribe(this, client);
    }
}
