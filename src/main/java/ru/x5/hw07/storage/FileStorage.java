package ru.x5.hw07.storage;

import ru.x5.hw07.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class FileStorage extends Storage {

    private File store;

    public FileStorage() {
        accounts=new ArrayList<>();
        System.setProperty("accountStoreFile", "./accountStore"); //Из какого-либо проперти-файла
        store = new File(System.getProperty("accountStoreFile"));
        if (!store.exists()) {
            try {
                store.createNewFile();
            } catch (IOException e) {
                System.err.println("Cannot create file!");
                e.printStackTrace();
            }
        }
        if (store.length() == 0) {
            fillDefaultData();
        }
        read();
    }

    private void fillDefaultData() {
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            accounts.add(new Account(random.nextInt(), "Holder" + random.nextInt(), random.nextInt()));
        }
        write();
    }

    private void read() {
        synchronized (store) {
            try {
                accounts=new ArrayList<>();
                BufferedReader reader = new BufferedReader(new FileReader(this.store));
                String acc;
                while ((acc = reader.readLine())!=null) {
                    String[] data = acc.split(" ");
                    accounts.add(new Account(Integer.parseInt(data[0]),
                            data[1],
                            Integer.parseInt(data[2])));
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File error.");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void write() {
        synchronized (store) {
            try {
                store.delete();
                store=new File(System.getProperty("accountStoreFile"));
                FileWriter writer = new FileWriter(this.store);
                for (Account account : accounts) {
                    writer.write(account.getAccountId()+" "+account.getAccountHolder()+" "+account.getAmount()+"\n");
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.err.println("Cant write to file!");
                e.printStackTrace();
            }
        }
    }

    public void save(){
        write();
    }
@Override
    public Account findAccountById(int accountId) {
        read();
        Account result =null;
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                result= account;
                break;
            }
        }
        return result;
    }
}
