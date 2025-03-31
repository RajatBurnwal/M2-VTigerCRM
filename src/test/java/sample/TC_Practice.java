package sample;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_Practice extends BaseClass {

	@Test
	public void textCase() throws Exception
	{
//		SeleniumUtility sUtil=new SeleniumUtility();
//		ExcelUtility eUtil = new ExcelUtility();
//		PropertiesUtility pUtil = new PropertiesUtility();
//		
//		String URL = pUtil.getDataFromPropertiesFile("url");
//		String UN = pUtil.getDataFromPropertiesFile("username");
//		String PWD = pUtil.getDataFromPropertiesFile("password");
		
		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
		
//		WebDriver driver = new ChromeDriver();
//		sUtil.implicitWait(driver, 15);
//		sUtil.maximizeWindow(driver);
//		sUtil.navigateToApplication(driver, URL);
		
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApplication(UN, PWD);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
		
//		hp.signOutOperation(driver);
//		
//		driver.quit();
	}
}
