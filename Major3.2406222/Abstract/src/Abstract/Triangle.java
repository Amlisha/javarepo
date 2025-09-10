package Abstract;

public class Triangle extends Shape
{
public Triangle(double bb, double hh) {b=bb,h=hh;}
public void draw(){System.out.println("\n Drawing Triangle");}
public void area(){System.out.println("\n Area: +0.5*b*h");}
}
