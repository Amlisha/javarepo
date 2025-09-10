package Multicatch;

public class Catch {

	public static void main(String args[]) {
    try {
    	int a = 5;    //args.length;
    	System.out.println(" a= " + a);
    	int b = 42 / a;
    	int c[] = {1};
    	//c[42] = 90;
    	System.out.println("We are in try block");
    }
    catch (ArithmeticException e) {
    	System.out.println("Divide by zero" + e);
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("Array index OOB " + e);
    }
  	finally
  	{
  	System.out.println("\nWe are in finally block");
    System.out.println("\nLine after try/catch block");
	}
	}
}
