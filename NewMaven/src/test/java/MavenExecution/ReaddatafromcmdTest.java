package MavenExecution;

import org.testng.annotations.Test;

public class ReaddatafromcmdTest {
	
	
	@Test(groups="smoke")
	public void readdatafromcmdtest()
	{
		System.out.println("Execute data from cmd");
		
		
		
		System.out.println(System.getProperty("url"));
	
		
		System.out.println(System.getProperty("un"));
		
	
		System.out.println(System.getProperty("pwd"));
		
		
	}
	@Test(groups="regression")
	public void readdatafromcmdrgtest()
	{
		System.out.println("Regression test suite");
		
	}
}


