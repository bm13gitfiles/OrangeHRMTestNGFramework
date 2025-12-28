package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.web.commons.WebCommons;

public class PIMpageElements extends WebCommons {
	
	public PIMpageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public By pimSideBarBy = By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='PIM']");
	
	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='PIM']")
	public WebElement pimSideBar;
	
	
	public By addNewUserPimButtonBy = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	
	
	//PIM - Add New User Elements
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addNewUserPimButton;
	
	
	@FindBy(xpath = "//input[@type='file' and @class='oxd-file-input']")
	public WebElement profileImagePIM;
	
	@FindBy(name="firstName")
	public WebElement firstNamePIM;
	
	@FindBy(name="middleName")
	public WebElement middleNamePIM;
	
	@FindBy(name="lastName")
	public WebElement lastNamePIM;
	
	public By createLoginDetailsCheckboxBy = By.xpath("//input[@type='checkbox']");
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement createLoginDetailsCheckboxPIM;
	

	public By userNamePIMby = By.xpath("(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]");
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]")
	public WebElement userNamePIM;
	
	
	public By passwordPIMBy = By.xpath("(//input[@class='oxd-input oxd-input--active' and @type='password'])[1]");
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @type='password'])[1]")
	public WebElement passwordPIM;
	
	
	public By confirmPasswordPIMBy = By.xpath("(//input[@type='password'])[2]");
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement confirmPasswordPIM;
	
	
	public By submitButtonPIMby = By.xpath("//button[@type='submit']");
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButtonPIM;
	
	
	public By toasterMessageBy = By.id("oxd-toaster_1");
	
	@FindBy(id = "oxd-toaster_1")
	public WebElement toaster;
	
	@FindBy(css= "p.oxd-text.oxd-text--p.oxd-text--toast-message.oxd-toast-content-text")
	public WebElement toasterMessage;
	
	
	
	//PIM - Search Elements
	
	public By employeeNamePIMSearchBy = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	public WebElement employeeNamePIMSearch;
	
	public By userSelectionPIMSearchBy = By.xpath("//div[@role='listbox']//div[@role='option']/span");
	
	
	public By userSelectedPIMBy = By.xpath("//div[@role='listbox']//div[@role='option']/span");
	
	@FindBy(xpath = "(//div[@role='listbox']//div[@role='option']/span)[1]")
	public WebElement userSelectedPIM;
	
	
	public By employeeNameFirstSuggestionBy = By.xpath("(//div[@role='listbox']//div[@role='option'])[1]");
	
	
	@FindBy(xpath = "(//div[@role='listbox']//div[@role='option'])[1]")
	public WebElement employeeNameFirstSuggestion;
	
	
	@FindBy(xpath = "//label[text()='Employee Id']/parent::div/following-sibling::div//input")
	public WebElement employeeIDPIM;
	
	
	public By employeeStatusPIMby = By.xpath("//div[@class='oxd-input-group__label-wrapper']//label[text()='Employment Status']/parent::div/following-sibling::div//div");
	
	@FindBy(xpath = "//div[@class='oxd-input-group__label-wrapper']//label[text()='Employment Status']/parent::div/following-sibling::div//div")
	public WebElement employeeStatusPIM;
	
	public By selectFreeLanceStatusBy = By.xpath("//div[@role='option']/span[text()='Freelance']");
	
	@FindBy(xpath = "//div[@role='option']/span[text()='Freelance']")
	public WebElement selectFreeLanceStatus;
	
	
	@FindBy(xpath = "//label[text()='Supervisor Name']/parent::div/following-sibling::div//input[@placeholder='Type for hints...']")
	public WebElement supervisorNamePIM;
	
	public By selectSupervisorNameBy = By.xpath("(//div[@role='listbox']//div[@role='option'])[1]");
	
	@FindBy(xpath = "(//div[@role='listbox']//div[@role='option'])[1]")
	public WebElement selectSupervisorNamePIMSearch;
	
	
	@FindBy(xpath = "//label[text()='Job Title']/parent::div/following-sibling::div")
	
	public WebElement jobTitle;
	
	
	public By jobTitleOptionsSelectBy = By.xpath("//div[@role='listbox']//div//span[text()='Chief Executive Officer']");
	
	@FindBy(xpath = "//div[@role='listbox']//div//span[text()='Chief Executive Officer']")
	
	public WebElement jobTitleOptions;
	
	@FindBy(xpath = "//label[text()='Sub Unit']/parent::div/following-sibling::div//div")
	
	public WebElement subUnitDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']//div[@role='listbox']//div//span[text()='Quality Assurance']")
	
	public WebElement selectSubUnitPIM;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	
	public WebElement searchButtonPIM ;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	
	public WebElement resetButtonPIM;
	
	
	//Navigate to Customer Personal Information form
	
	@FindBy(xpath = ("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"))
	public WebElement firstCustomerinList;
	
	
	@FindBy(xpath="//a[text()='Personal Details']")
	public WebElement personalDetailsPIM;
	
	
	
	// Edit Personal Information in PIM Form
	
	@FindBy(name = "firstName")
	public WebElement firstNamePersonalInfoForm;
		
	@FindBy(name = "middleName")
	public WebElement middleNamePersonalInfoForm;
	
	@FindBy(name = "lastName")
	public WebElement lastNamePersonalInfoForm;
	
	@FindBy(xpath = "//label[text()='Employee Id']/../..//input")
	public WebElement employeeIDPersonalInfoForm;
	
	@FindBy(xpath = "//label[text()='Other Id']/../..//input")
	public WebElement otherIDPersonalInfoForm;
	
	@FindBy(xpath = "//label[contains(text(), \"Driver's License Number\")]/../..//input")
	public WebElement driverLicenseNumberInPersonalInfoForm;
	
	@FindBy(xpath = "//label[contains(text(),'License Expiry Date')]/../..//input")
	public WebElement licenseExpiryDateInPersonalInfoForm;
	
	@FindBy(xpath = "//label[contains(text(),'Nationality')]/../..//div[@clear='false']")
	public WebElement nationalityInPersonalInfoForm;
	
	@FindBy(xpath = "//div[@role='listbox']//span[text()='East Timorese']")
	public WebElement eastTimorseNationality;
	
	@FindBy(xpath = "//label[text()='Marital Status']//..//..//div[@class='oxd-select-wrapper']")
	public WebElement maritalStatusInPersonalInfoForm;
	
	@FindBy(xpath = "//label[text()='Marital Status']//..//..//div[@class='oxd-select-wrapper']//div[@role='listbox']//span[text()='Other']")
	public WebElement otherMaritalStatusInPersonalInfoForm;
	
	@FindBy(xpath = "//label[contains(text(),'Date of Birth')]/../..//input")
	public WebElement dateOfBirthInPersonalInfoForm;
	
	@FindBy(xpath = "//label[contains(text(),'Gender')]/..//..//div//div//input[@type='radio']")
	public WebElement firstGenderInPersonalInfoForm;
	
	@FindBy(xpath = "//img[@alt='profile picture' and @class='employee-image']")
	public WebElement profilepictureInPersonalInfoForm;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveButtonInPersonalInfoForm;
	
	
	//Add Supervisor
	
	@FindBy(xpath = "//a[contains(text(),'Report-to')]")
	public WebElement reportToOption;
	
	@FindBy(xpath = "//div[@class='orangehrm-action-header']//h6[text()='Assigned Supervisors']//..//i")
	public WebElement addSupervisorButton;
	
	public By supervisorNameInputBy = By.xpath("//label[text()='Name']//..//..//input");
	
	@FindBy(xpath = "//label[text()='Name']//..//..//input")
	public WebElement supervisorNameInput;
	
	public By selectSupervisorNameSelBy = By.xpath("//div[@role='listbox']//span");
	
	@FindBy(xpath = "//div[@role='listbox']//span")
	public WebElement selectSupervisorNameSel;
	
	
	@FindBy(xpath = "//label[text()='Reporting Method']//..//..//div[@class='oxd-select-wrapper']")
	public WebElement reportingMethod;
	
	public By directMethodSelectionBy = By.xpath("//div[@role='listbox']//span[text()='Direct']");
	
	@FindBy(xpath = "//div[@role='listbox']//span[text()='Direct']")
	public WebElement directMethodSelection;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveButtonAddSupervsior;
	
	
	

}
