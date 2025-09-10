package Plan;

public class GetPlanFactory {
public Plan GenerateBill(String plan) {
	if (plan==null) return null;
	if (plan.equalsIgnoreCase("DOMESTICPLAN"))
	{
		return new DomesticPlan();
	}
	if
	(plan.equalsIgnoreCase("COMMERCIALPLAN")) {
		return new CommercialPlan();
	}
	if
	(plan.equalsIgnoreCase("INSTITUTIONALPLAN"))
	{
		return new InstitutionalPlan();
	}
	return null;
}
}
