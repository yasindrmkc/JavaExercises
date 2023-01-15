package final_2022_question_3;

public class BankAccount implements Comparable<BankAccount>{
    int accountNo;
    String holderName;
    double balance;
    BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void balanceChange(double amount){
        balance-=amount;
    }
    @Override
    public int compareTo(BankAccount o) {
        return this.holderName.compareTo(o.holderName);
    }
}
