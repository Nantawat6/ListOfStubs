package IntegrationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSalary {


	
	@Test
	void untregationtest() {
		ListOfStubs stub = new ListOfStubs();

	
		double netsalary =ListOfStubs.intregationCalculateNetSalary(14000, 4);
		assertEquals(13606, netsalary);
	}
	
	@Test
	void untregationtest2() {
		ListOfStubs stub = new ListOfStubs();

	
		double netsalary =ListOfStubs.intregationCalculateNetSalary(18000, 4);
		assertEquals(17250, netsalary);
	}

}
