package lab_question_9;

public abstract class Shape3D extends Shape2D {
    double depth;
    Shape3D(double depth,double height,double width){
        super(height, width);
        this.height=height;
    }
    Shape3D(double height,double radius){
        super(radius);
    }
    public abstract double getVolume();
    
}
