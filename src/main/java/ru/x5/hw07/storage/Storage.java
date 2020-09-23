package ru.x5.hw07.storage;

import ru.x5.hw07.Account;

import java.util.ArrayList;

public abstract class Storage {
    ArrayList<Account> accounts;

    public abstract void save(Account account);

    public abstract Account findAccountById(int accountId);

}
