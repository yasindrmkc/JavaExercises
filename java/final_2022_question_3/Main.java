package final_2022_question_3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankAccount a1=new BankAccount(1, "Yasin", 2000);
        BankAccount a2=new BankAccount(2, "Irem", 2500);
        BankAccount a3=new BankAccount(3, "Bora", 1000);
        BankAccount a4=new BankAccount(4, "Rabia", 1500);
        List<BankAccount> myAccounts=new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);
        Collections.sort(myAccounts);
        for (BankAccount bankAccount : myAccounts) {
            System.out.println(bankAccount.holderName);
        }
        for (BankAccount bankAccount : myAccounts) {
            bankAccount.balanceChange(500);
            System.out.println(bankAccount.holderName+" "+bankAccount.balance);
        }
    }
}
