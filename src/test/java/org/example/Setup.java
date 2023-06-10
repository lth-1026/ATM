package org.example;

import org.example.ATM.ATM;
import org.example.Account.Account;
import org.example.Bank.Bank;
import org.example.Card.Card;
import org.example.Person.Person;

import java.util.Arrays;


public class Setup{
    public static Bank kbBank = new Bank(1L, "kb_bank");
    public static Bank sinhanBank = new Bank(2L, "sinhan_bank");
    public static ATM atm = new ATM(Arrays.asList(kbBank, sinhanBank));
    public static Person taeho = new Person("TaeHo Lee", "man");
    public static Person taehyun = new Person("TaeHo Lee", "man");
    public static Person taehoon = new Person("TaeHo Lee", "man");
    public static Long taehoKBBankUserId = kbBank.addBankUser(taeho, 1234);
    public static Account taehoKBBankAccount1 = kbBank.openAccount(taehoKBBankUserId, 1L);
    public static Account taehoKBBankAccount2 = kbBank.openAccount(taehoKBBankUserId, 2L);
    public static Account taehoKBBankAccount3 = kbBank.openAccount(taehoKBBankUserId, 3L);

    public static Card taehoKBBankCard = kbBank.issueCard(taehoKBBankUserId);
}
