import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMTest2PIM extends OrangeHRMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Actions action = new Actions(driver);
		
		
		
//		12.Adding new employee information within the PIM page.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait.until(ExpectedConditions
//				.numberOfElementsToBeMoreThan(By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='PIM']"), 0));
//
//		WebElement pimSideBar = driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='PIM']"));
//
//		pimSideBar.click();
//
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
//				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"), 0));
//
//		WebElement addNewUserPimSideBar = driver
//				.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
//
//		addNewUserPimSideBar.click();
//
//		WebElement profileImage = driver.findElement(By.xpath("//input[@type='file' and @class='oxd-file-input']"));
//
//		profileImage.sendKeys(System.getProperty("user.dir") + "\\Attachments\\David-Fincher-png.png");
//
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.name("firstName"), 0));
//
//		WebElement firstNamePIM = driver.findElement(By.name("firstName"));
//
//		firstNamePIM.sendKeys("King");
//
//		WebElement middleNamePIM = driver.findElement(By.name("middleName"));
//
//		action.moveToElement(middleNamePIM).click().perform();
//
//		middleNamePIM.sendKeys("David");
//
//		WebElement lastNamePIM = driver.findElement(By.name("lastName"));
//
//		action.moveToElement(lastNamePIM).click().perform();
//
//		lastNamePIM.sendKeys("Fincher");
//
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//input[@type='checkbox']"), 0));
//
//		WebElement createLoginDetailsCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//
//		action.moveToElement(createLoginDetailsCheckbox).click().perform();
//
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
//				By.xpath("(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]"), 0));
//
//		WebElement userNamePIM = driver
//				.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]"));
//
//		action.moveToElement(userNamePIM).click().sendKeys("davidFinchersama1").perform();
//
//		WebElement passwordPIM = driver
//				.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active' and @type='password'])[1]"));
//
//		action.moveToElement(passwordPIM).click().sendKeys("Admin123").perform();
//		
//		
//		
//
//		WebElement confirmPasswordPIM = driver
//				.findElement(By.xpath("(//input[@type='password'])[2]"));
//
//		action.moveToElement(confirmPasswordPIM).click().sendKeys("Admin123").perform();
//		
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@type='submit']"), 0));
//		
//		WebElement submitButtonPIM = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		action.moveToElement(submitButtonPIM).click().perform();
//		
		
//		10.Verify such employee information within the PIM page.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("(//input[@placeholder='Type for hints...'])[1]"), 0));
		
		WebElement employeeNamePIMSearch = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
		
		action.moveToElement(employeeNamePIMSearch).click().sendKeys("David").perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div[@role='option']/span"), 0));
		
		String UserSelected = driver.findElement(By.xpath("(//div[@role='listbox']//div[@role='option']/span)[1]")).getText();
		
		WebElement employeeNamefirstSuggestion = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']/span"));
		
		employeeNamefirstSuggestion.click();
		
		
		
		
		WebElement employeeIDPIM = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input"));
		
		action.moveToElement(employeeIDPIM).click().sendKeys("0403").perform();
		
		
		WebElement employeeStatusPIM = driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//label[text()='Employment Status']/parent::div/following-sibling::div//div"));
		
		action.moveToElement(employeeStatusPIM).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='option']/span[text()='Freelance']"), 0));
		
		WebElement freeLanceDropdownSelect = driver.findElement(By.xpath("//div[@role='option']/span[text()='Freelance']"));
		
		action.moveToElement(freeLanceDropdownSelect).click().perform();
		
		
		
		WebElement supervisorNamePIM = driver.findElement(By.xpath("//label[text()='Supervisor Name']/parent::div/following-sibling::div//input[@placeholder='Type for hints...']"));
		
		action.moveToElement(supervisorNamePIM).click().sendKeys("joker").perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div//span"), 0));
		
		WebElement selectSuperVisor = driver.findElement(By.xpath("//div[@role='listbox']//div//span"));
		
		selectSuperVisor.click();
		
		WebElement jobTitle = driver.findElement(By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div"));
		
		action.moveToElement(jobTitle).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div//span[text()='Chief Executive Officer']"), 0));
		
		WebElement jobTitleOptionsSelect = driver.findElement(By.xpath("//div[@role='listbox']//div//span[text()='Chief Executive Officer']"));
		
		jobTitleOptionsSelect.click();
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Sub Unit']/parent::div/following-sibling::div//div"), 0));
		
		WebElement subUnitDropdown = driver.findElement(By.xpath("//label[text()='Sub Unit']/parent::div/following-sibling::div//div"));
		
		action.moveToElement(subUnitDropdown).click().perform();
		
		WebElement selectSubUnitPIM = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']//div[@role='listbox']//div//span[text()='Quality Assurance']"));
		
		selectSubUnitPIM.click();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@type='submit']"), 0));
		
		WebElement searchButtonPIM = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		
		
		
		
//		11.Verify Reset Search Results in the PIM page.
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("(//input[@placeholder='Type for hints...'])[1]"), 0));
		
		WebElement employeeNamePIMSearchReset = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
		
		action.moveToElement(employeeNamePIMSearchReset).click().sendKeys("David").perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div[@role='option']/span"), 0));
		
		String UserSelectedReset = driver.findElement(By.xpath("(//div[@role='listbox']//div[@role='option']/span)[1]")).getText();
		
		WebElement employeeNamefirstSuggestionReset = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']/span"));
		
		employeeNamefirstSuggestionReset.click();
		
		
		
		
		WebElement employeeIDPIMReset = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input"));
		
		action.moveToElement(employeeIDPIMReset).click().sendKeys("0403").perform();
		
		
		WebElement employeeStatusPIMReset = driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//label[text()='Employment Status']/parent::div/following-sibling::div//div"));
		
		action.moveToElement(employeeStatusPIMReset).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='option']/span[text()='Freelance']"), 0));
		
		WebElement freeLanceDropdownSelectReset = driver.findElement(By.xpath("//div[@role='option']/span[text()='Freelance']"));
		
		action.moveToElement(freeLanceDropdownSelectReset).click().perform();
		
		
		
		WebElement supervisorNamePIMReset = driver.findElement(By.xpath("//label[text()='Supervisor Name']/parent::div/following-sibling::div//input[@placeholder='Type for hints...']"));
		
		action.moveToElement(supervisorNamePIMReset).click().sendKeys("joker").perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div//span[text()='joker john selvam']"), 0));
		
		WebElement selectSuperVisorReset = driver.findElement(By.xpath("//div[@role='listbox']//div//span[text()='joker john selvam']"));
		
		selectSuperVisorReset.click();
		
		WebElement jobTitleReset = driver.findElement(By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div"));
		
		action.moveToElement(jobTitleReset).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div//span[text()='Chief Executive Officer']"), 0));
		
		WebElement jobTitleOptionsSelectReset = driver.findElement(By.xpath("//div[@role='listbox']//div//span[text()='Chief Executive Officer']"));
		
		jobTitleOptionsSelectReset.click();
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Sub Unit']/parent::div/following-sibling::div//div"), 0));
		
		WebElement subUnitDropdownReset = driver.findElement(By.xpath("//label[text()='Sub Unit']/parent::div/following-sibling::div//div"));
		
		action.moveToElement(subUnitDropdownReset).click().perform();
		
		WebElement selectSubUnitPIMReset = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']//div[@role='listbox']//div//span[text()='Quality Assurance']"));
		
		selectSubUnitPIMReset.click();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@type='submit']"), 0));
		
		WebElement searchButtonPIMReset = driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebElement resetButtonPIM = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
		
		action.moveToElement(resetButtonPIM).click().perform();
		
		
		

//		13. Update personal information within the my info page and save them.
		
		
		WebElement myInfoMenu = driver.findElement(By.xpath("//span[text()='My Info']"));
		
		myInfoMenu.click();
		
		
		
		
//		14. Update contact details information within the my info page along with attachments and save them.

	}

}
