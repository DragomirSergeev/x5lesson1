package ru.x5.hw07.storage;

public interface SQLQueries {
    String FIND_BY_ID = "select * from accounts where id=?";
    String UPDATE_ACCOUNT = "update accounts set amount=? where id=?";
    String COUNT_ROWS = "select count(*) from accounts";
    String GET_ALL_ACCOUNTS = "select * from accounts";
}
