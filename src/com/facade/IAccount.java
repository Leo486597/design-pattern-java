package com.facade;

import java.math.BigDecimal;

public abstract class IAccount {
    private BigDecimal amount;
    
    // Common constructor
    public IAccount(BigDecimal initAmount) {
        this.amount = initAmount;
    }

    public int getAccountNumber(){
        // Pretend to be a random number
        return (int) Math.floor(Math.random()*101);
    };

    public abstract void deposit(BigDecimal amount);

    public abstract void withdraw(BigDecimal amount);

    public abstract void transfer(BigDecimal amount);

    
}











