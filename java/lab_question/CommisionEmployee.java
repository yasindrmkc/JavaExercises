package lab_question;

public class CommisionEmployee extends Employee {

    double grossSale,commisionRate;
    CommisionEmployee(String firstName, String lastName, int ssn,double grossSale,double commisionRate) {
        super(firstName, lastName, ssn);
        this.commisionRate=commisionRate;
        this.grossSale=grossSale;
    }

    @Override
    public double earning() {
        return grossSale*commisionRate;
    }

    @Override
    public String toString() {
        return "CommisionEmployee [grossSale=" + grossSale + ", commisionRate=" + commisionRate + "]";
    }
    
}
