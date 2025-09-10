package CustomExc;

public class CustomExc
{
public static void proc(int a)
{
	try {
		throw new MyException(a);
	}catch(MyException e) {System.out.println("Catching my exception"+e);}
}//end proc
	public static void main(String args[]) 
	{
	proc(1);
	proc(10);
	}//end mian
}//end class