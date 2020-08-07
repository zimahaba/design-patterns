package edu.zimahaba.designpatterns.behavioral.observer;

public class ClientTwo implements Notifiable {

    public void update(Book book) {
        System.out.println("Client 2, the book '" + book.getName() + "' from author '" + book.getAuthor() + "' is now available!");
    }

}
