package org.example.Bank;

import org.example.Person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private static Bank bank = new Bank(1L, "kb_bank");
    private static Person taeho = new Person("TaeHo Lee", "man");
    @Test
    void openAccount() {
        BankUser bankUser = bank.addBankUser(taeho, 1234);
        bank.openAccount(bankUser);
        assertEquals(bankUser.getAccounts().stream().findAny().get().getBankUser(), bankUser);
    }

    @Test
    void addBankUser() {
        BankUser bankUser = bank.addBankUser(taeho, 1234);
        assertEquals(bankUser.getPerson(), taeho);
    }
}