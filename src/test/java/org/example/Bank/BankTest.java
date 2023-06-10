package org.example.Bank;

import org.example.Account.Account;
import org.example.Person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private static Bank bank = new Bank(1L, "kb_bank");
    private static Person taeho = new Person("TaeHo Lee", "man");
    @Test
    void openAccount() {
        Long bankUserId = bank.addBankUser(taeho, 1234);
        Account account = bank.openAccount(bankUserId, 123L);
        assertEquals(bank.getAccounts(bankUserId).stream().findAny().get(), account);
    }

    @Test
    void addBankUser() {
        Long bankUserId = bank.addBankUser(taeho, 1234);
        assertTrue(bank.isCorrectPin(bankUserId, 1234));
    }
}