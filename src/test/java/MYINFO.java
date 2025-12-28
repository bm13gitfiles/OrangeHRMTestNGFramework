import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MYINFO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Actions action = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement myInfoMenu = driver.findElement(By.xpath("//span[text()='My Info']"));

		myInfoMenu.click();

		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//div[@class='orangehrm-edit-employee-name']//h6[@class='oxd-text oxd-text--h6 --strong']"), 0));

		WebElement myInfoPage = driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']//h6[@class='oxd-text oxd-text--h6 --strong']"));
		
		String originalName = myInfoPage.getText();
		
		System.out.println(originalName);
		
		Thread.sleep(1000);

		WebElement employeeFirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		action.moveToElement(employeeFirstName).click().perform();
		
		action.keyDown(employeeFirstName, Keys.CONTROL).sendKeys("a").keyUp(employeeFirstName, Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		action.click(employeeFirstName).sendKeys("King");
		
		Thread.sleep(1000);

		WebElement employeeMiddleName = driver.findElement(By.name("middleName"));
		
		action.moveToElement(employeeMiddleName).click().perform();
		
		action.keyDown(employeeMiddleName, Keys.CONTROL).sendKeys("a").keyUp(employeeMiddleName, Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		employeeMiddleName.sendKeys("David");
		
		Thread.sleep(1000);

		WebElement employeeLastName = driver.findElement(By.name("lastName"));
		
		action.moveToElement(employeeLastName).click().perform();
		
		action.keyDown(employeeLastName,Keys.CONTROL).sendKeys("a").keyUp(employeeLastName,Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		employeeLastName.sendKeys("Fincher");
		
		Thread.sleep(1000);

		WebElement employeeIDInfo = driver.findElement(By.xpath(
				"//label[@class='oxd-label' and text()='Employee Id']/parent::div/following-sibling::div//input"));

		action.moveToElement(employeeIDInfo).click().perform();
		
		action.keyDown(employeeIDInfo,Keys.CONTROL).sendKeys("a").keyUp(employeeIDInfo,Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		employeeIDInfo.sendKeys("132639");
		
		Thread.sleep(1000);

		WebElement otherIDinfo = driver.findElement(By
				.xpath("//label[@class='oxd-label' and text()='Other Id']/parent::div/following-sibling::div//input"));

		action.moveToElement(otherIDinfo).click().perform();
		
		action.keyDown(otherIDinfo,Keys.CONTROL).sendKeys("a").keyUp(otherIDinfo,Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		otherIDinfo.sendKeys("392613");
		
		Thread.sleep(1000);

		WebElement driverLicenseInfo = driver.findElement(By.xpath(
				"//label[@class='oxd-label' and contains(text(), \"Driver's License\")]//parent::div//following-sibling::div//input"));
		
		action.moveToElement(driverLicenseInfo).click().perform();
		
		action.keyDown(driverLicenseInfo,Keys.CONTROL).sendKeys("a").keyUp(driverLicenseInfo,Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		driverLicenseInfo.sendKeys("XDFGH67854RR");
		
		Thread.sleep(1000);
		
		
		
		//License Expiry Date
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='License Expiry Date']/parent::div/following-sibling::div//i"), 0));
		
		WebElement licenseExpriyDatePersonalDetails = driver.findElement(By.xpath("//label[text()='License Expiry Date']/parent::div/following-sibling::div//i"));
		
		action.moveToElement(licenseExpriyDatePersonalDetails).click().perform();
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[@class='oxd-calendar-selector-year']"), 0));
		
		WebElement yearSelector = driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']"));
		
		action.moveToElement(yearSelector).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='1981']"), 0));
		
		WebElement yearSelectorOptionsLE = driver.findElement(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='1981']"));
		
		yearSelectorOptionsLE.click();
		
		WebElement monthSelectorLicenseExpiry = driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-month']"));
	
		monthSelectorLicenseExpiry.click();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option')]"), 0));
		
		
		WebElement monthSelectorOptionsLE = driver.findElement(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='May']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", monthSelectorOptionsLE);
		
		WebElement dateSelectorLE = driver.findElement(By.xpath("//div[contains(@class,'oxd-calendar-date-wrapper')]/div[text()='5']"));
		
		dateSelectorLE.click();
		
		Thread.sleep(1000);
		
		//Nationality
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div//i"),0));
		
		WebElement nationalityDropdownPD = driver.findElement(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div//i"));
		
		action.moveToElement(nationalityDropdownPD).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div//div[@role='option']//span[text()='Afghan']"), 0));
		
		WebElement nationalityOptionsPD = driver.findElement(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div//div[@role='listbox']/div/span[text()='Finnish']"));
		
		nationalityOptionsPD.click();
		
		Thread.sleep(500);
		
		//Marital Status
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div//div/i"), 0));
		
		WebElement maritalStatusPD = driver.findElement(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div//div/i"));
		
		maritalStatusPD.click();
		
		WebElement maritalStatusOtherPD = driver.findElement(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div//div[@role='listbox']//div/span[text()='Other']"));
		
		
		maritalStatusOtherPD.click();
		
		Thread.sleep(500);
		
		//Date Of Birth
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Date of Birth']/parent::div/following-sibling::div//i"), 0));
		
		WebElement dOBDatePersonalDetails = driver.findElement(By.xpath("//label[text()='Date of Birth']/parent::div/following-sibling::div//i"));
		
		action.moveToElement(dOBDatePersonalDetails).click().perform();
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[@class='oxd-calendar-selector-year']"), 0));
		
		WebElement yearSelectorDOBPD = driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']"));
		
		action.moveToElement(yearSelectorDOBPD).click().perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='1972']"), 0));
		
		WebElement yearSelectorOptionsDOBPD = driver.findElement(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='1972']"));
		
		yearSelectorOptionsDOBPD.click();
		
		
		Thread.sleep(1000);
		
		WebElement monthSelectorDOBPD = driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-month']"));
	
		monthSelectorDOBPD.click();
		
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option')]"), 0));
		
		
		WebElement monthSelectorOptionsDOBPD = driver.findElement(By.xpath("//li[contains(@class,'oxd-calendar-dropdown--option') and text()='May']"));
		
		js.executeScript("arguments[0].click();", monthSelectorOptionsDOBPD);
		
		WebElement dateSelectorDOBPD = driver.findElement(By.xpath("//div[contains(@class,'oxd-calendar-date-wrapper')]/div[text()='5']"));
		
		dateSelectorDOBPD.click();
		
		Thread.sleep(500);
		
		//Click on Save Button
		
		WebElement saveButton1PD = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		
		js.executeScript("arguments[0].click()", saveButton1PD);
		
		//ToasterConfirmation
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oxd-toaster_1")));
		
		WebElement toasterSuccessPD = driver.findElement(By.id("oxd-toaster_1"));
		
		String toasterSuccessPDMessage = toasterSuccessPD.getText();
		
		System.out.println(toasterSuccessPDMessage);
	
		
		System.out.println("Execution Completed");

	}

}
