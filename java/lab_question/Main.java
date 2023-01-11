package lab_question;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Yasin", "Dirmikci", 1, 100);
        CommisionEmployee commisionEmployee=new CommisionEmployee("İrem", "Kartal", 2, 50.0, 50.0   );
        BasePlusCommisionEmployee basePlusCommisionEmployee=new BasePlusCommisionEmployee("Bora", "Cicek", 3, 1.0, 1.0, 99);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Rabia ", "Osko", 4, 50, 30);
        System.out.println(salariedEmployee.earning()); 
        System.out.println(salariedEmployee.toString());
        System.out.println(commisionEmployee.earning());
        System.out.println(commisionEmployee.toString());
        System.out.println(basePlusCommisionEmployee.earning());
        System.out.println(basePlusCommisionEmployee.toString());
        System.out.println(hourlyEmployee.earning());
        System.out.println(hourlyEmployee.toString());
    }
}
