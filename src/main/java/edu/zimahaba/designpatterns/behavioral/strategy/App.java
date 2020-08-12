package edu.zimahaba.designpatterns.behavioral.strategy;

import edu.zimahaba.designpatterns.behavioral.strategy.bank.BancoBrasil;
import edu.zimahaba.designpatterns.behavioral.strategy.bank.Bradesco;
import edu.zimahaba.designpatterns.behavioral.strategy.bank.Itau;

public class App {

    public static void main(String[] args) {

        BankContext context = new BankContext();

        context.setBankStrategy(new BancoBrasil());
        System.out.println("Your Banco do Brasil balance is " + context.getBalance());

        context.setBankStrategy(new Itau());
        System.out.println("Your Itau balance is " + context.getBalance());

        context.setBankStrategy(new Bradesco());
        System.out.println("Your Bradesco balance is " + context.getBalance());

    }
}
