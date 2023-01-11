package lab_question_9;

public class TestMain {
    public static void main(String[] args) {
        
        Square s1=new Square(10);
        Square s2=new Square(11);
        Rectangle r1= new Rectangle(5,10);
        Circle c1= new Circle(6);
        Sphere sp1= new Sphere(5, 10);
        Cylinder cy1=new Cylinder(10, 6);

        compareArea(c1,s1);
        compareArea(r1,s1);
        compareArea(sp1,s1);

        compareArea(s1, s2);
        compareVolume(cy1,cy1);

        
    }
    public static void compareArea(Shape2D s1,Shape2D s2){
        if(s1.getArea()>s2.getArea()){
            System.out.println("First area is greater than second one.Bigger area :"+s1.getArea());
        }
        else if(s1.getArea()==s2.getArea()){
            System.out.println("Area values are equals.");
        }
        else{
            System.out.println("Second area is greater than first one.Bigger area :"+s2.getArea());
        }
    }
    public static void compareVolume(Shape3D s1,Shape3D s2){
        if(s1.getVolume()>s2.getVolume()){
            System.out.println("First volume is greater than second one.Bigger volume :"+s1.getVolume());
        }
        else if(s1.getVolume()==s2.getVolume()){
            System.out.println("Volume values are equals.");
        }
        else{
            System.out.println("Second volume is greater than first volume.Bigger volume : "+s2.getVolume());
        }
    }
}


