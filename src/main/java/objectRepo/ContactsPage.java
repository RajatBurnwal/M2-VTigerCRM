package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Contacts Page POM class
 * @author rajat burnwal
 * @version 25.03.10
 */
public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createNewContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactsIcon() {
		return createNewContactsIcon;
	}
	
	/**
	 * This is a business library to click on create new Contact icon
	 */
	public void clickOnCreatingNewContactIcon()
	{
		getCreateNewContactsIcon().click();
	}
	
}
