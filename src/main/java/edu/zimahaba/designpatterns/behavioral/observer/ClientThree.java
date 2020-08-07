package edu.zimahaba.designpatterns.behavioral.observer;

public class ClientThree implements Notifiable {

    public void update(Book book) {
        System.out.println("Client 3, the book '" + book.getName() + "' from author '" + book.getAuthor() + "' is now available!");
    }

}
