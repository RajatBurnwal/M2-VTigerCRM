package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class POMPractice {

	@FindAll({@FindBy(id = "email"), @FindBy(xpath = "//input[@name='email']")})
	WebElement element;
	
	public POMPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility sUtil = new SeleniumUtility();
		
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		sUtil.navigateToApplication(driver, "https://www.facebook.com/");
		Thread.sleep(2000);
		POMPractice p = new POMPractice(driver);
		p.element.sendKeys("robin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.element.sendKeys("robin");
		
	}
}
