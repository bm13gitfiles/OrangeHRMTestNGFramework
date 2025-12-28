package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import demo.orangehrm.framework.web.commons.WebCommons;

public class HomepageElements extends WebCommons {
	
	
	
	//6. Verify home page menus in left side bar
	
	public HomepageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.oxd-sidepanel-body input[placeholder='Search']")
	public WebElement searchTypeSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Admin']")
	public WebElement adminSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='PIM']")
	public WebElement pimSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Leave']")
	public WebElement leaveSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Time']")
	public WebElement timeSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Recruitment']")
	public WebElement recruitmentSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='My Info']")
	public WebElement myInfoSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Performance']")
	public WebElement performanceSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Dashboard']")
	public WebElement dashboardSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Directory']")
	public WebElement directorySideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Maintenance']")
	public WebElement maintenanceSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Claim']")
	public WebElement claimSideBar;

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//span[text()='Buzz']")
	public WebElement buzzSideBar;
	
	@FindBy(xpath="//h6[text()='Admin']")
	public WebElement AdminPageTitle;



}
