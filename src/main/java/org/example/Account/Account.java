package org.example.Account;

import lombok.Getter;
import org.example.Bank.Banking;
import org.example.Money.Money;
import org.example.Person.Person;

@Getter
public class Account implements Banking {
    private Long bankId;
    private Person person;
    private Long accountNum;
    private Money balance;

    public Account(Long bankId, Person person, Long accountNum) {
        this.bankId = bankId;
        this.person = person;
        this.accountNum = accountNum;
        this.balance = new Money(0);
    }

    @Override
    public void deposit(Money money) {
        int newAmount = balance.getAmount() + money.getAmount();
        balance = new Money(newAmount);
    }

    @Override
    public Money withdraw(Integer input) {
        if(balance.getAmount() < input) {
            throw new RuntimeException("You don't have enough money");
        } else {
            int newAmount = balance.getAmount() - input;
            balance = new Money(newAmount);
        }
        return new Money(input);
    }
}
