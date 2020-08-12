package edu.zimahaba.designpatterns.behavioral.strategy;

public class BankContext {

    private BankStrategy bankStrategy;

    public void setBankStrategy(BankStrategy bankStrategy) {
        this.bankStrategy = bankStrategy;
    }

    public String getBalance() {
        return bankStrategy.getBalance();
    }
}
