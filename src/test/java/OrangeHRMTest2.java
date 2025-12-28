import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);


		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Homepage - Verify home page menus in left side bar

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

			//	7. Verify search user within the admin page along with results.
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
			
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
					By.cssSelector(
							"div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active"),
					0));

			WebElement userNameAdmin = driver.findElement(By.cssSelector(
					"div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active"));

			userNameAdmin.click();
			
			userNameAdmin.sendKeys("AdminDavidFincherXYZABC");

			WebElement userRoleDropdownSearchForm = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']"));

			action.moveToElement(userRoleDropdownSearchForm).click().perform();

			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
					By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']"), 0));

			By adminOptionBy = By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']");

			WebElement adminOption = driver
					.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']"));
			WebElement essOption = driver
					.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='ESS']"));

			adminOption.click();
			
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']"), 0));
			
			
			WebElement employeeNameSearch = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']"));
			
			action.moveToElement(employeeNameSearch).click().perform();
			
			employeeNameSearch.sendKeys("John");
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div[@role='option']//span"), 0));
			
			WebElement employeeNameSuggestions = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span"));
			
			employeeNameSuggestions.click();
			
			
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"), 0));
			
			WebElement statusSearchDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
			
			action.moveToElement(statusSearchDropdown).click().perform();
			
			WebElement enabledOptionstatusSearchDropdown = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Enabled']"));
			
			enabledOptionstatusSearchDropdown.click();
			
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@type='submit']"), 0));
			
			WebElement submitButtonSearch = driver.findElement(By.xpath("//button[@type='submit']"));
			
			action.moveToElement(submitButtonSearch).click().perform();
			
			
			WebElement numberOfSearchResults = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span"));
			
			System.out.println(numberOfSearchResults.getText());
			
				

		System.out.println("Execution completed");
		
		
		
		
//		8. Verify Reset Search Results in admin page
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");	

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.cssSelector(
						"div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active"),
				0));

		WebElement userNameAdminReset = driver.findElement(By.cssSelector(
				"div.oxd-grid-item.oxd-grid-item--gutters:nth-of-type(1) input.oxd-input.oxd-input--active"));

		userNameAdminReset.click();
		
		userNameAdminReset.sendKeys("AdminDavidFincherXYZ");

		WebElement userRoleDropdownSearchFormReset = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']"));

		action.moveToElement(userRoleDropdownSearchFormReset).click().perform();

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']"), 0));

		By adminOptionByReset = By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']");

		WebElement adminOptionByReset1 = driver
				.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Admin']"));
		WebElement essOptionReset = driver
				.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='ESS']"));

		adminOptionByReset1.click();
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']"), 0));
		
		
		WebElement employeeNameSearchReset = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']"));
		
		action.moveToElement(employeeNameSearchReset).click().perform();
		
		employeeNameSearchReset.sendKeys("John");
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']//div[@role='option']//span"), 0));
		
		WebElement employeeNameSuggestionsReset = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span"));
		
		employeeNameSuggestionsReset.click();
		
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"), 0));
		
		WebElement statusSearchDropdownReset = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
		
		action.moveToElement(statusSearchDropdownReset).click().perform();
		
		WebElement enabledOptionstatusSearchDropdownReset = driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option']//span[text()='Enabled']"));
		
		enabledOptionstatusSearchDropdownReset.click();
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@type='submit']"), 0));
		
		WebElement submitButtonSearchReset = driver.findElement(By.xpath("//button[@type='submit']"));
		
		action.moveToElement(submitButtonSearchReset).click().perform();
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"), 0));
		
		WebElement resetButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
		
		resetButton.click();

//		9. Verify "Add new user" within this admin page.
		
//		
//		10.Verify such employee information within the PIM page.
		
		Thread.sleep(2000);
		
		
		
		
		
		
//		11.Verify Reset Search Results in the PIM page.
//		12.Adding new employee information within the PIM page.
//		13. Update personal information within the my info page and save them.
//		14. Update contact details information within the my info page along with attachments and save them.
		
		

		// driver.quit();

	}

}
