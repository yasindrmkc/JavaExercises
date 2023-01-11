package employee;
public class PartTimeEmployee extends employee{
    int hours;
    PartTimeEmployee(String name,double wage,int hours){
        super(name, wage);
        this.hours=hours;
    }
    @Override
    public double CalculateSalary() {
        return wage * hours;
    }
}