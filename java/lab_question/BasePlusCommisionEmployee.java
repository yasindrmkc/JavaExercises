package lab_question;

public class BasePlusCommisionEmployee extends CommisionEmployee {

    double grossSale,commisionRate,baseSalary;
    BasePlusCommisionEmployee(String firstName, String lastName, int ssn, double grossSale, double commisionRate,double baseSalary) {
        super(firstName, lastName, ssn, grossSale, commisionRate);
        this.baseSalary=baseSalary;
    }

    @Override
    public double earning() {
        return (commisionRate * grossSale) + baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee [grossSale=" + grossSale + ", commisionRate=" + commisionRate
                + ", baseSalary=" + baseSalary + "]";
    }
    
}
