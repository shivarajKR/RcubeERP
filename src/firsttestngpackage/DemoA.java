package firsttestngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest {
	@Test(priority=1)
	public void testDemoA(){
		Reporter.log("@Test1",true);
	}

}
