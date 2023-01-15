package final_2022_question_3;

public class BankAccount implements Comparable<BankAccount> {
    int accontNo;
    String holderName;
    double balance;
    public BankAccount(int accontNo,String holderName,double balance)
    {
        this.accontNo=accontNo;
        this.balance=balance;
        this.holderName=holderName;
    }
    public double balanceChange(double amount)
    {
        return balance-=amount;
    }
    @Override
    public int compareTo(BankAccount o) {
        return this.holderName.compareTo(o.holderName);
    }
}