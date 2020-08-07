package edu.zimahaba.designpatterns.behavioral.observer;

public class ClientOne implements Notifiable {

    public void update(Book book) {
        System.out.println("Client 1, the book '" + book.getName() + "' from author '" + book.getAuthor() + "' is now available!");
    }
}
