package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Home Page POM class
 * @author rajat burnwal
 * @version 25.03.10
 */
public class HomePage {

	@FindBys({@FindBy(xpath = "//a[text()='Leads']"), @FindBy(xpath ="//a[@href='index.php?module=Leads&action=index']")})
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	/**
	 * This is a business library to click on Leads menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on Contacts menu
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform signout operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignOutOption().click();
	}
}
