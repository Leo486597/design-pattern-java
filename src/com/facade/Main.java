package com.facade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        int mySaving = bankService.createNewAccount("saving", new BigDecimal(500.00));
        int myInvestment = bankService.createNewAccount("investment", new BigDecimal("3000.00"));
        bankService.TransferMoney(mySaving, myInvestment, new BigDecimal(200.00));
    }      
}
