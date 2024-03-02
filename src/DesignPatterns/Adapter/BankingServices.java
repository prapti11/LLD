package DesignPatterns.Adapter;


// Instead of directly calling the Bank services we will create an interface to avoid tight coupling
//Target interface
public interface BankingServices {
    // Parameters required can change,
    // 3rd party can change so generally recommended practise is to create a separate class as a holder and add all the attributes there
    // In future if any modification is required we can simply change the holder class
    public void addBankAccount(Bank bank);

    boolean pay(double amount, String account);

    double checkBalance();
}
