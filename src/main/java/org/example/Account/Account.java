package org.example.Account;

import lombok.Getter;
import org.example.Bank.Banking;
import org.example.Money.Money;
@Getter
public class Account implements Banking {
    private Long bankId;
    private BankUser bankUser;
    private Long accountNum;
    private Money balance;

    public Account(Long bankId, Person bankUser, Long accountNum) {
        this.bankId = bankId;
        this.bankUser = bankUser;
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
