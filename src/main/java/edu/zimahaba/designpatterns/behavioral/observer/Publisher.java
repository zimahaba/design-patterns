package edu.zimahaba.designpatterns.behavioral.observer;

import java.util.*;

public class Publisher {

    private static Publisher publisher;

    private Map<Book, List<Notifiable>> subscribers;

    private Publisher() {
        subscribers = new HashMap<Book, List<Notifiable>>();
    }

    public static Publisher getInstance() {
        if (publisher == null) {
            publisher = new Publisher();
        }
        return publisher;
    }

    public void addBook(Book book) {
        subscribers.put(book, new ArrayList<Notifiable>());
    }

    public void subscribe(Book book, Notifiable subscriber) {
        List<Notifiable> clients = subscribers.get(book);
        if (!clients.contains(subscriber)) {
            clients.add(subscriber);
        }
        subscribers.put(book, clients);
    }

    public void unsubscribe(Book book, Notifiable subscriber) {
        List<Notifiable> clients = subscribers.get(book);
        if (clients.contains(subscriber)) {
            clients.remove(subscriber);
        }
        subscribers.put(book, clients);
    }

    public void notify(Book book) {
        for (Notifiable client : subscribers.get(book)) {
            client.update(book);
        }
    }
}
