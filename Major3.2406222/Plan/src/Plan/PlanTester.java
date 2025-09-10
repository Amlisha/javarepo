package Plan;
import java.util.Scanner;
public class PlanTester {
	public static void main(String[] args) {
		GetPlanFactory gp = new GetPlanFactory();
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("Plan name:");
			String in = s.nextLine();
			if (in.equalsIgnoreCase("exit")) {
				break;
			}
			Plan p = gp.GenerateBill(in);
			if (p != null) {
				System.out.println("Plan created:");
				p.display();
			}
		}
	}

}
