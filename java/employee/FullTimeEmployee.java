package employee;

public class FullTimeEmployee extends employee {
    FullTimeEmployee(String name,double wage){
        super(name,wage);
    }

    @Override
    public double CalculateSalary() {
        
        return wage *10;
    }
    
}
