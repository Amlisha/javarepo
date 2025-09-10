package Abstract;

public class ShapeTester 
{
	public static void main(String[] args) 
{
     //Shape s=new Shape();//error
     Circle c =new Circle(4,5);//error
     c.draw();
     c.area();//print valuea area of circle
     c.message();
     
     Triangle t =new Triangle(3,5);//error
     t.draw();
     t.area();//print value of area of circle
     t.message();
     
 }//end main
}//end class
