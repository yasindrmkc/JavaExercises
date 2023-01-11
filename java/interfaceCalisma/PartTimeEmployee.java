package interfaceCalisma;

public class PartTimeEmployee extends Employee {

    int hours;
    public PartTimeEmployee(String name, int wage,int hours) {
        super(name, wage);
        this.hours=hours;
    }

    @Override
    public void CalculateSalary() {
        System.out.println(wage*hours);
    }
    
}
