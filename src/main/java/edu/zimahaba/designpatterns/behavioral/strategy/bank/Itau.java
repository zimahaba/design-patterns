package edu.zimahaba.designpatterns.behavioral.strategy.bank;

import edu.zimahaba.designpatterns.behavioral.strategy.BankStrategy;

public class Itau implements BankStrategy {
    @Override
    public String getBalance() {
        System.out.println("Accessing Itau API to retrieve your balance...");
        return "30";
    }
}
