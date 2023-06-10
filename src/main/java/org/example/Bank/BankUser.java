package org.example.Bank;

import lombok.Getter;
import org.example.Account.Account;
import org.example.Person.Person;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BankUser {
    private Long bankUserId;
    private Person person;

    private List<Account> accounts;
    private Integer pin;

    public BankUser(Long bankUserId, Person person, Integer pin) {
        this.bankUserId = bankUserId;
        this.person = person;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }
}
