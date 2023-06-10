package org.example.Bank;

import lombok.Getter;
import org.example.Account.Account;
import org.example.Money.Money;
import org.example.Person.Person;

import java.util.*;

@Getter
public class Bank implements Banking{
    private Long bankId;
    private String bankName;
    private Map<Long, BankUser> bankUsers;

    public Bank(Long bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankUsers = new HashMap<>();
    }

    public void openAccount(BankUser bankUser) {
        Account account = new Account(bankId, bankUser, 25L);
        bankUser.getAccounts().add(account);
    }
    public BankUser addBankUser(Person person, Integer pin) {
        Long newUserId = getBankUserCount() + 1;
        BankUser bankUser = new BankUser(newUserId, person, pin);
        bankUsers.put(newUserId, bankUser);

        return bankUser;
    }

    public boolean isCorrectPin(Long bankUserId, Integer pin) {
        BankUser bankUser = bankUsers.get(bankUserId);
        return Objects.equals(bankUser.getPin(), pin);
    }



    private Long getBankUserCount() {
        return (long) bankUsers.size();
    }

    @Override
    public Money getBalance(Account account) {
        return null;
    }

    @Override
    public void deposit(Account account, Money money) {

    }

    @Override
    public Money withdraw(Account account, Integer input) {
        return null;
    }
}
