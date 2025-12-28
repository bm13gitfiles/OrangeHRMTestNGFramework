package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.web.commons.WebCommons;

public class MembershipPageElements extends WebCommons {
	
	public MembershipPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public By pimSideBarBy = By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='PIM']");
	
	@FindBy(xpath = "//span[text()='My Info']/parent::a")
	public WebElement myInfoLink;
	
	@FindBy(xpath = "//a[text()='Memberships']")
	public WebElement membershipsLink;
	
	@FindBy(xpath = "//h6[text()='Assigned Memberships']/parent::div/button")
	public WebElement viewMembershipPage;
	
	
	@FindBy(xpath = "//h6[text()='Assigned Memberships']/parent::div/button")
	public WebElement addMembershipButton;
	
	
	@FindBy(xpath = "//label[text()='Membership']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement addMembershipPage;
	
	
	
	@FindBy(xpath = "//label[text()='Membership']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement membershipType;
	
	
	@FindBy(xpath = "//span[text()='British Computer Society (BCS)']//parent::div")
	public WebElement britishComputerSocietyMembershipType;
	
	
	@FindBy(xpath = "//label[text()='Subscription Paid By']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement subscriptionPaidBy;
	
	@FindBy(xpath = "//span[text()='Company']//parent::div")
	public WebElement companySubscriptionPaidBy;
	
	
	@FindBy(xpath = "//label[text()='Subscription Amount']//parent::div//parent::div//input")
	public WebElement subscriptionAmount;
	
	
	@FindBy(xpath = "//label[text()='Currency']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement subscriptionCurrency;
	
	
	@FindBy(xpath = "//span[text()='Swaziland Lilangeni']//parent::div")
	public WebElement swazilandLilangeniCurrency;
	
	
	@FindBy(xpath = "//label[text()='Subscription Commence Date']//parent::div//parent::div//input")
	public WebElement subscriptionCommenceDate;
	
	
	@FindBy(xpath = "//label[text()='Subscription Renewal Date']//parent::div//parent::div//input")
	public WebElement subscriptionRenewalDate;
	
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and text()=' Save ']")
	public WebElement SaveButton;
	
	
	@FindBy(id = "oxd-toaster_1")
	public WebElement toaster;
	
	@FindBy(css= "p.oxd-text.oxd-text--p.oxd-text--toast-message.oxd-toast-content-text")
	public WebElement toasterMessage;
	
	

}
