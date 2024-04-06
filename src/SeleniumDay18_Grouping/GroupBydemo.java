package SeleniumDay18_Grouping;

import org.testng.annotations.Test;

public class GroupBydemo {
	
	@Test(groups = {"smoke","sanity","regression"})
	public void tc1() {
		System.out.println("Hi i am in tc1");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void tc2() {
		System.out.println("Hi i am in tc2");
	}
	
	@Test(groups= {"regression"})
	public void tc3() {
		System.out.println("Hi i am in tc3");
	}

}
