package sample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {

	@Test(priority = 2)
	public void createUser()
	{
		System.out.println("User created");
	}
	
	@Test(priority = 2, dependsOnMethods = {"deleteUser"})
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("User deleted");
//		Assert.fail();
	}

}
