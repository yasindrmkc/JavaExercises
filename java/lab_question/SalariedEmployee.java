package lab_question;

public class SalariedEmployee extends Employee{

    double weeklySalary;
    SalariedEmployee(String firstName, String lastName, int ssn,double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary=weeklySalary;
    }
    @Override
    public double earning() {
        
        return weeklySalary;
    }
    @Override
    public String toString() {
        return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
    }
}
