package IntegrationTesting;

public class ListOfStubs extends Salary {
	//salary = 14000 = 750
	public static double stubCalculateSocialInsuranceFee(double salary)
	{
		return 750;
	}
	//salary = 14000 = 800
	public static double stubCalculateOT(double salary, double hour)
	{	

		return 800;
	}
	//salary = 14000  OT = 800 Tax=144
	public static double stubCalculateTax(double salary, double OT)
	{	
		return 444;
	}
	public static double  intregationCalculateNetSalary(double salary, double extrahour)
	{	double netsalary = 0.0;
		double socialinsurance = stubCalculateSocialInsuranceFee(salary);
		double OT = stubCalculateOT(salary, extrahour);
		double tax = stubCalculateTax(salary, OT);
		
		netsalary = (salary+OT)-tax-socialinsurance;
		
		System.out.println("Net Salary: " + netsalary);
	
		return netsalary;
	}
}