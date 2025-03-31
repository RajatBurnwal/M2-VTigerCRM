package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {

	@Test(groups = {"Regression"})
	public void CON_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		
		String fName = eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String title = eUtil.getDataFromExcelFile("Contacts", 2, 3);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(fName, lName, title);
	}
	
	@Test
	public void demo()
	{
		System.out.println("Hi");
	}
}
