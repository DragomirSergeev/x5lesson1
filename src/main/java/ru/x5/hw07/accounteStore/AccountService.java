package ru.x5.hw07.accounteStore;

import ru.x5.hw07.storage.Storage;

public interface AccountService {

    void withdraw(int accountId, int ammount) throws NotEnoughtMoneyException, UnknownAccountException;

    void balance(int accountId) throws UnknownAccountException;

    void deposit(int accountId, int amount) throws NotEnoughtMoneyException, UnknownAccountException;

    void transfer(int from, int to, int amount) throws NotEnoughtMoneyException, UnknownAccountException;

    void setStorage(Storage storage);
}
