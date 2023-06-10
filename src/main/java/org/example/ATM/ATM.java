package org.example.ATM;

import org.example.Account.Account;
import org.example.Bank.Bank;
import org.example.Card.Card;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATM {
    private Long ATMId;
    private Map<Long, Bank> banks;

    public ATM() {
        this.banks = new HashMap<>();
    }

    public ATM(List<Bank> banks) {
        this.banks = new HashMap<>();
        for(Bank bank : banks) {
            this.banks.put(bank.getBankId(), bank);
        }
    }

    public List<Account> insertCard(Card card, Integer pin) {
        Bank bank = banks.get(card.getBankId());
        Long bankUserId = card.getBankUserId();
        if(!bank.isCorrectPin(card.getBankUserId(), pin)) {
            throw new RuntimeException("pin is wrong");
        }
        return bank.getAccounts(bankUserId);
    }

}
