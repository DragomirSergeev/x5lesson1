package ru.x5.hw07.accounteStore;

import ru.x5.hw07.Account;
import ru.x5.hw07.storage.Storage;


public class CustomAccountService implements AccountService {
    private Storage storage;

    @Override
    public void withdraw(int accountId, int ammount) throws NotEnoughtMoneyException, UnknownAccountException {
        Account account = storage.findAccountById(accountId);
        if (account == null) throw new UnknownAccountException();
        synchronized (account) {
            if (account.getAmount() - ammount < 0) throw new NotEnoughtMoneyException();
            account.setAmount(account.getAmount() - ammount);
            storage.save();
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        Account result = storage.findAccountById(accountId);
        if (result == null) {
            throw new UnknownAccountException();
        } else {
            System.out.println("balance: " + result.getAmount());
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughtMoneyException, UnknownAccountException {
        Account account = storage.findAccountById(accountId);
        if (account == null) throw new UnknownAccountException();
        synchronized (account) {
            if (account.getAmount() + amount < account.getAmount()) {
                throw new NotEnoughtMoneyException();//на случай выхода за инт
            }
            account.setAmount(account.getAmount() + amount);
            storage.save();
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughtMoneyException, UnknownAccountException {
        Account accountFrom = storage.findAccountById(from);
        Account accountTo = storage.findAccountById(to);
        if (accountFrom == null || accountTo == null) {
            throw new UnknownAccountException();
        }
        if (accountFrom.getAmount() - amount < 0) {
            throw new NotEnoughtMoneyException();
        }
        synchronized (accountFrom) {
            synchronized (accountTo) {
                withdraw(from, amount);
                deposit(to, amount);
            }

        }
    }

    @Override
    public void setStorage(Storage storage) {
        this.storage = storage;
    }


}
