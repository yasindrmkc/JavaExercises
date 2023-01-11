package interfaceCalisma;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("İrem", 100, 10);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Yasin", 1500);
        Employee[] employees ={partTimeEmployee,fullTimeEmployee};
        for (Employee employee : employees) {
            if(employee instanceof FullTimeEmployee){
                employee.CalculateSalary();
            }
        }
    }
}
