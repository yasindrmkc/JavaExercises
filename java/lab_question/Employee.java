package lab_question;

public abstract class Employee {
    String firstName;
    String lastName;
    int ssn;
    Employee(String firstName,String lastName,int ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }
    public abstract double earning();
    
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
    }
    
}
