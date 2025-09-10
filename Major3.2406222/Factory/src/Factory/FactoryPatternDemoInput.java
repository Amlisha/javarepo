package Factory;
import java.util.Scanner;
public class FactoryPatternDemoInput {
public static void main(String[] args) {
	ShapeFactory shapeFactory = new ShapeFactory();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter shape you need");
		String sh=sc.nextLine();
		
		if(sh.equalsIgnoreCase("exit"))break;
		
		Shape myshape=shapeFactory.getShape(sh);
		if(myshape!=null) {
			System.out.println("Shape created");
			myshape.draw();
		}//end id
	}//end while
}//end main
}//end class
