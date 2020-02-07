package com.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccount;
    
    public BankService(){
        this.bankAccount = new Hashtable<Integer, IAccount>();
    }
    
    public int createNewAccount(String type, BigDecimal initAmount){
        IAccount newAccount = null;

        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
        }

        if (newAccount == null) 
            return -1;
        
        int accountNumber = newAccount.getAccountNumber();
        this.bankAccount.put(accountNumber, newAccount);
        
        return accountNumber;
    }
    
    public void TransferMoney(int accountFrom, int accountTo, BigDecimal amount){
        bankAccount.get(accountFrom).withdraw(amount);
        bankAccount.get(accountTo).deposit(amount);
    }
                
}
