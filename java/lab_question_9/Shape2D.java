package lab_question_9;

public abstract class Shape2D {
    public final double PI=3.14;
    public double height;
    public double width;
    public double radius;
    Shape2D(double height,double width){
        this.height=height;
        this.width=width;
    }
    Shape2D(double radius){
        this.radius=radius;
    }
    Shape2D(){}
    public abstract double getArea();
    public abstract String toString();
}
