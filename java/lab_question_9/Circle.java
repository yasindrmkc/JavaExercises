package lab_question_9;

public class Circle extends Shape2D{
    public double propertyForCircle;
    Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Radius : "+radius + "Circle Area : "+this.getArea();
    }
    
        
}
