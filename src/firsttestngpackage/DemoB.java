package firsttestngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest{

	@Test(priority=2)
	public void testDemoB1(){
		Reporter.log("@TestC1",true);
	}
	@Test(priority=3)
	public void testDemoB(){
		Reporter.log("@TestC2",true);
	}
}
