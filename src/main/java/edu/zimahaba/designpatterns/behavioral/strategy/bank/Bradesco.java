package edu.zimahaba.designpatterns.behavioral.strategy.bank;

import edu.zimahaba.designpatterns.behavioral.strategy.BankStrategy;

public class Bradesco implements BankStrategy {
    @Override
    public String getBalance() {
        System.out.println("Accessing Bradesco API to retrieve your balance...");
        return "20";
    }
}
