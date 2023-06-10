package org.example.Bank;

import lombok.Getter;
import org.example.Account.Account;
import org.example.Card.Card;
import org.example.Person.Person;

import java.util.*;

public class Bank{
    @Getter
    private Long bankId;
    private String bankName;
    private Map<Long, BankUser> bankUsers;

    public Bank(Long bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankUsers = new HashMap<>();
    }

    public Account openAccount(Long bankUserId, Long accountNum) {
        BankUser bankUser = getBankUser(bankUserId);
        Account account = new Account(bankId, bankUser.getPerson(), accountNum);
        bankUser.getAccounts().add(account);
        return account;
    }
    public Long addBankUser(Person person, Integer pin) {
        Long newUserId = getBankUserCount() + 1;
        BankUser bankUser = new BankUser(newUserId, person, pin);
        bankUsers.put(newUserId, bankUser);

        return bankUser.getBankUserId();
    }

    public boolean isCorrectPin(Long bankUserId, Integer pin) {
        BankUser bankUser = bankUsers.get(bankUserId);
        return Objects.equals(bankUser.getPin(), pin);
    }

    public Card issueCard(Long bankUserId) {
        return new Card(bankId, bankUserId);
    }

    public List<Account> getAccounts(Long bankUserId) {
        return bankUsers.get(bankUserId).getAccounts();
    }

    private BankUser getBankUser(Long bankUserId) {
        return bankUsers.get(bankUserId);
    }
    private Long getBankUserCount() {
        return (long) bankUsers.size();
    }
}
