package Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1,"Student 1", 25);
        Student s2=new Student(2, "Student 2", 21);
        Student s3=new Student(3, "Student 3", 23);
        Student s4=new Student(4, "Student 4", 28);
        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.name + " " + student.age);
        }
    }
}
