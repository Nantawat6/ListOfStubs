package IntegrationTesting;

public class ListOfStubs extends Salary {
	//salary = 14000 = 750
	public static double stubCalculateSocialInsuranceFee(double salary)
	{
		
		double fee = 0.0;
		if (salary >= 20000)
		{	fee = 1000;			
		}
		else if ((salary >= 15000)&&(salary < 20000))
		{	fee = 800;			
		}
		else 
		{	fee = 750; 
		}
		return fee;
		
		
	}
	//salary = 14000 = 800
	public static double stubCalculateOT(double salary, double hour)
	{	
		double OT = 0.0;
		int rate = 0;
		
		if (salary >= 20000)
		{	rate = 300;			
		}
		else if ((salary >= 15000)&&(salary < 20000))
		{	rate = 250;			
		}
		else 
		{	rate = 200; 
		}
		
		OT = hour*rate;
		
		
		
		return OT;
	}
	//salary = 14000  OT = 800 Tax=144
	public static double stubCalculateTax(double salary, double OT)
	{	
		double tax = 0.0;
		double income = salary + OT;
		double taxRate = 0.0;
		
		if (income >= 20000)
		{	taxRate = 0.07;			
		}
		else if ((income >= 15000)&&(income < 20000))
		{	taxRate = 0.05;			
		}
		else 
		{	taxRate = 0.03; 
		}
		tax = income*taxRate;
		
		return tax;
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