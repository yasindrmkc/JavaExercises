package lab_question;

public class HourlyEmployee extends Employee{

    double wage;
    int hours;
    HourlyEmployee(String firstName, String lastName, int ssn,int hours,double wage) {
        super(firstName, lastName, ssn);
        this.hours=hours;
        this.wage=wage;
    }

    @Override
    public double earning() {
        if(hours<=40){
            return wage*hours;
        }
        else
        return 40*wage+(hours-40)*wage*1.5;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
    }
    
}
