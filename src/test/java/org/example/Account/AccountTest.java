package org.example.Account;

import org.example.Bank.Bank;
import org.example.Money.Money;
import org.example.Person.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private static Integer amount = 10000;
    private static Long bankId = 1L;
    private static Person taeho = new Person("TaeHo Lee", "man");

    private static Account account = new Account(bankId, taeho, 2134L);

    @BeforeAll
    static void setup() {
        account.deposit(new Money(amount));
    }
    @Test
    void deposit() {
        Money money = new Money(30);
        Integer amount = money.getAmount() + account.getBalance().getAmount();
        account.deposit(money);
        assertEquals(account.getBalance().getAmount(), amount);
    }

    @Test
    void withdraw() {
        Integer input = 30;
        Money money = account.withdraw(input);
        assertEquals(input, money.getAmount());
    }

    @Test
    void getBankId() {
    }

    @Test
    void getPerson() {
        assertEquals(taeho, account.getPerson());
    }

    @Test
    void getAccountNum() {
    }

    @Test
    void getBalance() {
        assertEquals(amount, account.getBalance().getAmount());
    }
}