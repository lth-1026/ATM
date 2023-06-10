package org.example.Bank;

import org.example.Account.Account;
import org.example.Money.Money;

public interface Banking {
    Money getBalance(Account account);

    void deposit(Account account, Money money);

    Money withdraw(Account account, Integer input);
}
