package ru.x5.hw07.storage;

import ru.x5.hw07.Account;

import java.sql.*;
import java.util.Random;

public class DBStorage extends Storage {
    private final String DB_URL;
    private final String DB_DRIVER;
    private static Connection connection;

    public DBStorage() {
        DB_URL="jdbc:h2:mem:test";//property
        DB_DRIVER="org.h2.Driver";
        try {
            this.connection = DriverManager.getConnection(DB_URL+";INIT=RUNSCRIPT FROM './schema.sql'","sa","sa");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        int count =0;
        try{
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(SQLQueries.COUNT_ROWS);
            set.next();
            count=set.getInt(1);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(count==0){
            fillDefaultData();
        }

    }

    @Override
    public void save(Account account) {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE_ACCOUNT)){
            statement.setInt(1,account.getAmount());
            statement.setInt(2,account.getAccountId());
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public Account findAccountById(int accountId) {
        Account account=null;
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.FIND_BY_ID)){
            statement.setInt(1,accountId);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                account=new Account();
                account.setAccountId(set.getInt("id"));
                account.setAccountHolder(set.getString("holder"));
                account.setAmount(set.getInt("amount"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return account;
    }

//
    private void fillDefaultData(){
        try{
            Random random = new Random();
            for(int i=0;i<10;i++){
             PreparedStatement statement = connection.prepareStatement("insert into accounts (id,holder,amount) " +
                     "values ('"+i+"','holder"+i+"','"+random.nextInt()+"')");
             statement.execute();
             statement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
