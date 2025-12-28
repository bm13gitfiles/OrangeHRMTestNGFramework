package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import demo.orangehrm.framework.web.commons.WebCommons;

public class AdminpageElements extends WebCommons {


	public AdminpageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addUserButton;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Admin']")
	public WebElement adminSideBar;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement userRoleDropdown;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']//span[text()='Admin']")
	public WebElement adminRoleFromDropdown;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employeeNameInput;

	@FindBy(xpath = "//div[@role='option']//span")
	public WebElement employeeNameSuggestion;

	@FindBy(xpath = "//label[text()='Username']/../../div/input")
	public WebElement usernameInput;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement statusDropdown;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']//span[text()='Enabled']")
	public WebElement enabledStatusOption;

	@FindBy(xpath = "(//input[@type='password' and @autocomplete='off'])[1]")
	public WebElement passwordInput;

	@FindBy(xpath = "(//input[@type='password' and @autocomplete='off'])[2]")
	public WebElement confirmPasswordInput;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButton;
	
	@FindBy(id="oxd-toaster_1")
	public WebElement toasterMessage;
	
	
	//Search elements
	
	public By searchUserNameBy = By.cssSelector("div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active");
	
	@FindBy(css="div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active")
	public WebElement searchUserName;
	
	
	public By searchUserRoleBy = By.xpath("//div[@class='oxd-select-wrapper']");
	
	@FindBy(xpath="//div[@class='oxd-select-wrapper']")
	public WebElement searchUserRole;
	
	public By searchAdminRoleSelectionBy = By.xpath("//div[@role='listbox']//div[@role='option'][span[text()='Admin']]");
	
	@FindBy(xpath="//div[@role='listbox']//div[@role='option'][span[text()='Admin']]")
	public WebElement searchAdminRoleSelection;
	
	@FindBy(xpath="//label[text()='Employee Name']/../../div/div/div/input")
	public WebElement searchEmployeeName;
	
	@FindBy(xpath="//div[@role='listbox']//span")
	public WebElement searchEmployeeNameSelection;
	
	@FindBy(xpath="//label[text()='Status']/../..//div[text()='-- Select --']")
	public WebElement searchStatus;
	
	@FindBy(xpath="//div[@role='listbox']//span[normalize-space(text())='Enabled']")
	public WebElement searchEnabledStatusSelection;
	
	@FindBy(xpath="//button[text()=' Reset ']")
	public WebElement searchFormResetButton;
	
	@FindBy(xpath="//button[text()=' Search ']")
	public WebElement searchFormSearchButton;
	
	
	
	

}
