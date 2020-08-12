package edu.zimahaba.designpatterns.behavioral.strategy.bank;

import edu.zimahaba.designpatterns.behavioral.strategy.BankStrategy;

public class BancoBrasil implements BankStrategy {
    @Override
    public String getBalance() {
        System.out.println("Accessing Banco do Brasil API to retrieve your balance...");
        return "10";
    }
}
