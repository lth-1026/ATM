package org.example.Account;

import lombok.Getter;
import org.example.Bank.BankUser;
import org.example.Money.Money;
@Getter
public class Account {
    private Long bankId;
    private BankUser bankUser;
    private Long accountNum;
    private Money balance;

    public Account(Long bankId, BankUser bankUser, Long accountNum) {
        this.bankId = bankId;
        this.bankUser = bankUser;
        this.accountNum = accountNum;
        this.balance = new Money();
    }
}
