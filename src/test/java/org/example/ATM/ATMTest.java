package org.example.ATM;

import org.example.Account.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Setup.*;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {


    @Test
    void insertCardWithCorrectPin() {
        List<Account> accounts = atm.insertCard(taehoKBBankCard, 1234);
        assertTrue(accounts.containsAll(kbBank.getAccounts(taehoKBBankUserId)));
    }

    @Test
    void insertCardWithWrongPin() {
        List<Account> accounts;
        try {
            accounts = atm.insertCard(taehoKBBankCard, 4322);
        } catch (RuntimeException e) {
            assertEquals("pin is wrong", e.getMessage());
        }
    }
}