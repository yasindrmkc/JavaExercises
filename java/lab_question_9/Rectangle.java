package lab_question_9;

public class Rectangle extends Shape2D{
    public Rectangle(double width,double height){
        super(height, width);
    }
    public double getArea(){
        return width*height;
    }
    @Override
    public String toString(){
        return "Rectangle Width : "+width+"Rectangle Height : "+height+"Rectangle Area :"+getArea();
    }
}
