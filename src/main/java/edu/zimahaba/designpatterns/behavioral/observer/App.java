package edu.zimahaba.designpatterns.behavioral.observer;

public class App {

    public static void main(String[] args) {

        Book nineteenEightyFour = new Book(1, "1984", "George Orwell", false);
        Book farenheit451 = new Book(2, "Farenheit 451", "Ray Bradbury", false);
        Book harryPotter = new Book(3, "Harry Potter", "J. K. Rowling", false);
        Book domCasmurro = new Book(4, "Dom Casmurro", "Machado de Assis", false);
        Book lordOfTheRings = new Book(5, "Lord of the Rings", "J. R. R. Tolkien", false);

        ClientOne clientOne = new ClientOne();
        ClientTwo clientTwo = new ClientTwo();
        ClientThree clientThree = new ClientThree();

        Publisher publisher = Publisher.getInstance();
        publisher.addBook(nineteenEightyFour);
        publisher.addBook(farenheit451);
        publisher.addBook(harryPotter);
        publisher.addBook(domCasmurro);
        publisher.addBook(lordOfTheRings);

        nineteenEightyFour.alertMeWhenAvailable(clientOne);
        nineteenEightyFour.alertMeWhenAvailable(clientTwo);

        farenheit451.alertMeWhenAvailable(clientOne);

        harryPotter.alertMeWhenAvailable(clientThree);

        domCasmurro.alertMeWhenAvailable(clientTwo);
        domCasmurro.alertMeWhenAvailable(clientThree);

        lordOfTheRings.alertMeWhenAvailable(clientOne);
        lordOfTheRings.alertMeWhenAvailable(clientTwo);
        lordOfTheRings.alertMeWhenAvailable(clientThree);

        nineteenEightyFour.setAvailable(true);
        farenheit451.setAvailable(true);
        harryPotter.setAvailable(true);
        domCasmurro.setAvailable(true);
        lordOfTheRings.setAvailable(true);

        nineteenEightyFour.alertMeWhenAvailable(clientThree);
        farenheit451.alertMeWhenAvailable(clientTwo);
        farenheit451.alertMeWhenAvailable(clientThree);
        harryPotter.alertMeWhenAvailable(clientOne);
        harryPotter.alertMeWhenAvailable(clientTwo);
        domCasmurro.alertMeWhenAvailable(clientOne);

        nineteenEightyFour.setAvailable(true);
        farenheit451.setAvailable(true);
        harryPotter.setAvailable(true);
        domCasmurro.setAvailable(true);
        lordOfTheRings.setAvailable(true);

        publisher.unsubscribe(nineteenEightyFour, clientThree);
        publisher.unsubscribe(farenheit451, clientThree);
        publisher.unsubscribe(harryPotter, clientThree);
        publisher.unsubscribe(domCasmurro, clientThree);
        publisher.unsubscribe(lordOfTheRings, clientThree);

        nineteenEightyFour.setAvailable(true);
        farenheit451.setAvailable(true);
        harryPotter.setAvailable(true);
        domCasmurro.setAvailable(true);
        lordOfTheRings.setAvailable(true);
    }

}
