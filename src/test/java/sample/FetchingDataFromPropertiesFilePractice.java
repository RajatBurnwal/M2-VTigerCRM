package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class FetchingDataFromPropertiesFilePractice {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String URL = prop.getProperty("url");
//		String UN = prop.getProperty("username");
//		String PWD = prop.getProperty("password");
//		System.out.println(value);
		PropertiesUtility pUtil = new PropertiesUtility();
		String URL = pUtil.getDataFromPropertiesFile("url");
		
		SeleniumUtility sUtil = new SeleniumUtility();
		
		WebDriver driver = new ChromeDriver();
		sUtil.navigateToApplication(driver, URL);
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN, Keys.TAB, PWD);

	}

}
