package DesignPatterns.Adapter;

import DesignPatterns.Adapter.ThirdParty.ICICIBankApi;

public class ICICIAdapter implements BankingServices{
    private final ICICIBankApi iciciBankApi;

    public ICICIAdapter(ICICIBankApi iciciBankApi){
        this.iciciBankApi=iciciBankApi;

    }
    @Override
    public void addBankAccount(Bank bank) {
        iciciBankApi.registerBankAccount(bank.name, bank.type, bank.dob, bank.pan);
    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance() {
        return 0;
    }
}
