package DesignPatterns.Adapter;

import DesignPatterns.Adapter.ThirdParty.YesBankApi;
//Adapter
public class YesBankAdapter implements BankingServices {

    // Dependency injection: We will inject the actual YesBankApi class
    // This is just a wrapper over YesBankApi, we will use this to use to access YesBankApi
    private final YesBankApi yesBankApi;

    public YesBankAdapter(YesBankApi yesBankApi){
        this.yesBankApi=yesBankApi;
    }


    @Override
    public void addBankAccount(Bank bank) {
        yesBankApi.registerBankAccount(bank.type, bank.aadhar, bank.name);
    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance() {
        return 0.0;
    }
}
