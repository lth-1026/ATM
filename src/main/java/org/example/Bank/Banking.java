package org.example.Bank;

import org.example.Account.Account;
import org.example.Money.Money;

public interface Banking {
    Money getBalance();

    void deposit(Money money);

    Money withdraw(Integer input);
}
