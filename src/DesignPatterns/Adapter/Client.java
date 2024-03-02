package DesignPatterns.Adapter;

import DesignPatterns.Adapter.ThirdParty.YesBankApi;

public class Client {
    public static void main(String[] args) {
        YesBankAdapter yesBankAdapter=new YesBankAdapter(new YesBankApi());

        PhonePe phonePe=new PhonePe(yesBankAdapter);
        phonePe.creatAccount();

    }
}
