package DesignPatterns.Adapter;

public class PhonePe {
    private BankingServices bankingServices;

    public PhonePe(BankingServices bankingServices){
        this.bankingServices=bankingServices;
    }

    public void creatAccount(){
        Bank bank = new Bank();
        bank.name="Prapti";
        bank.pan="AN767767GH";
        bank.aadhar="1209873456";
        bankingServices.addBankAccount(bank);
    }


}
