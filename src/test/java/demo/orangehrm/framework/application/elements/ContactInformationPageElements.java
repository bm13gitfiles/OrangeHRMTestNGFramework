package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.web.commons.WebCommons;

public class ContactInformationPageElements extends WebCommons {
	
	public ContactInformationPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public By pimSideBarBy = By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='PIM']");
	
	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='PIM']")
	public WebElement pimSideBar;
	
	@FindBy(xpath = ("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"))
	public WebElement firstCustomerinList;
	
	@FindBy(xpath="//a[text()='Contact Details']")
	public WebElement contactDetailsPIM;
	
	@FindBy(xpath="//label[text()='Street 1']/../..//input")
	public WebElement street1ContactInfo;
	
	@FindBy(xpath="//label[text()='Street 2']/../..//input")
	public WebElement street2ContactInfo;	
	
	@FindBy(xpath="//label[text()='City']/../..//input")
	public WebElement cityContactInfo;
	
	@FindBy(xpath="//label[text()='State/Province']/../..//input")
	public WebElement stateProvinceContactInfo;
	
	@FindBy(xpath="//label[text()='Zip/Postal Code']/../..//input")
	public WebElement zipPostalContactInfo;
	
	@FindBy(xpath="//label[text()='Country']/../..//div[@class='oxd-select-wrapper']")
	public WebElement countrySelectorContactInfo;
	
	@FindBy(xpath="//div[@role='listbox']//span[text()='Christmas Island']")
	public WebElement countrySelectorfromDropdownContactInfo;
	
	//Telephone Section
	
	@FindBy(xpath="//label[text()='Home']/../..//input")
	public WebElement homeTelephoneContactInfo;
	
	@FindBy(xpath="//label[text()='Mobile']/../..//input")
	public WebElement mobileTelephoneContactInfo;
	
	@FindBy(xpath="//label[text()='Work']/../..//input")
	public WebElement workTelephoneContactInfo;
	
	//Email section

	@FindBy(xpath="//label[text()='Work Email']/../..//input")
	public WebElement workEmailContactInfo;
	
	@FindBy(xpath="//label[text()='Other Email']/../..//input")
	public WebElement otherEmailContactInfo;
	
	@FindBy(xpath="//h6[text()='Attachments']/following-sibling::button/i")
	public WebElement addAttachmentContactInfo;
	
	@FindBy(css="input.oxd-file-input")
	public WebElement browseAttachmentButtonContactInfo;
	
	public By browseAttachmentButtonContactInfoby = By.cssSelector("input.oxd-file-input");
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement saveAttachmentButtonContactInfo;
	
	public By toasterMessageBy = By.id("oxd-toaster_1");
	
	@FindBy(id = "oxd-toaster_1")
	public WebElement toaster;
	
	@FindBy(css= "p.oxd-text.oxd-text--p.oxd-text--toast-message.oxd-toast-content-text")
	public WebElement toasterMessage;
	
}
