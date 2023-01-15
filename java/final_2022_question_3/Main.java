package final_2022_question_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount a1=new BankAccount(10, "İrem", 2000);
        BankAccount a2=new BankAccount(11, "Yasin", 1500);
        BankAccount a3=new BankAccount(12, "Bora", 500);
        BankAccount a4=new BankAccount(13, "Rabia", 800);
        ArrayList<BankAccount> myAccounts=new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);
        for (BankAccount bankAccount : myAccounts) {
            System.out.println(bankAccount.holderName);
        }
    }
}
