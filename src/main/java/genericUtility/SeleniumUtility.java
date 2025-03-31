package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a utility class which has all components from Selenium library
 * @author rajat burnwal
 * @version 25.03.07
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to open an application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	/**
	 * This is a generic method to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to provide implicit wait to the execution
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/////////////Handling Alert popup///////////
	
	/**
	 * This is a generic method to accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to cancel the alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This is a generic method to fetch alert message
	 * @param driver
	 * @return
	 */
	public String getAlertMessage(WebDriver driver)
	{
		String value = driver.switchTo().alert().getText();
		return value;
	}
	
	/**
	 * This is a generic method to send value to alert popup
	 * @param driver
	 * @param value
	 */
	public void sendValueToAlert(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	/////////////Handling dropdown///////////////
	
	/**
	 * This is a generic method to select option in a dropdown using the index
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select option in a dropdown using the value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select option in a dropdown using the visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement element, String visibleText)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	
	/////////////Mouse Actions////////////////
	
	/**
	 * This is a generic method to perform mouse hovering action on a webelement
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click action on a webelement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This is a generic method to take the screenshot of a webpage
	 * @param driver
	 * @param dateTimeStamp
	 * @return
	 * @throws IOException
	 */
	public String takeScreenshot(WebDriver driver, String dateTimeStamp) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\image -"+dateTimeStamp+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();		//For Listeners
	}
}
