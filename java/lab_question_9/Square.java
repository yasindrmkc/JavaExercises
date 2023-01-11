package lab_question_9;

public class Square extends Shape2D{
    public Square(double width){
        this.width=width;   
    }
    public double getArea(){
        return width*width;
    }
    @Override
    public String toString(){
        return "Width : "+width+"Square Area :"+this.getArea();
    }
}
