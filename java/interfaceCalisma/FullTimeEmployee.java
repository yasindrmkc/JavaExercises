package interfaceCalisma;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int wage) {
        super(name, wage);
    }

    @Override
    public void CalculateSalary() {
        System.out.println(wage);
    }
}
