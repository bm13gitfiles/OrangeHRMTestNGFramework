import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetails {

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

		// Click on Contact Details

		WebElement contactDetailsLink = driver
				.findElement(By.xpath("//a[@href='/web/index.php/pim/contactDetails/empNumber/7']"));

		action.moveToElement(contactDetailsLink).click().perform();

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath("//h6[contains(@class,'orangehrm-main-title') and text()='Contact Details']"), 0));

		WebElement contactDetailsPageTitle = driver
				.findElement(By.xpath("//h6[contains(@class,'orangehrm-main-title') and text()='Contact Details']"));

		System.out.println(contactDetailsPageTitle.getText());
		
		Thread.sleep(1000);

		// Street 1

		WebElement street1 = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Street 1']/parent::div/following-sibling::div//input"));

		action.moveToElement(street1).click().perform();

		action.keyDown(street1, Keys.CONTROL).sendKeys("a").keyUp(street1, Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.perform();

		street1.sendKeys("The Chapter Office");

		// Street 2

		WebElement street2 = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Street 2']/parent::div/following-sibling::div//input"));

		action.moveToElement(street2).click().perform();

		action.keyDown(street2, Keys.CONTROL).sendKeys("a").keyUp(street2, Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.perform();

		street2.sendKeys("Westminster Abbey - Dean's Yard");

		// City

		WebElement city = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='City']/parent::div/following-sibling::div//input"));

		action.moveToElement(city).click().perform();

		action.keyDown(city, Keys.CONTROL).sendKeys("a").keyUp(city, Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		city.sendKeys("Near the River Thames");

		// State - Province

		WebElement stateProvince = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='State/Province']/parent::div/following-sibling::div//input"));

		action.moveToElement(stateProvince).click().perform();

		action.keyDown(stateProvince, Keys.CONTROL).sendKeys("a").keyUp(stateProvince, Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();

		stateProvince.sendKeys("London");

		// Zip - POSTAL CODE

		WebElement zipPostalCode = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Zip/Postal Code']/parent::div/following-sibling::div//input"));

		action.moveToElement(zipPostalCode).click().perform();

		action.keyDown(zipPostalCode, Keys.CONTROL).sendKeys("a").keyUp(zipPostalCode, Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();

		zipPostalCode.sendKeys("SW1P 3PA");

		Thread.sleep(500);

		// Country

		WebElement countrySelectorCD = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Country']/parent::div/following-sibling::div//i"));

		action.moveToElement(countrySelectorCD).click().perform();

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath("//div[@role='listbox']/div[@role='option']/span[text()='Cameroon']"), 0));

		WebElement countryOptionsCD = driver
				.findElement(By.xpath("//div[@role='listbox']/div[@role='option']/span[text()='Cameroon']"));

		countryOptionsCD.click();

		// Home

		WebElement homeTelephone = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Home']/parent::div/following-sibling::div//input"));

		action.moveToElement(homeTelephone).click().perform();

		action.keyDown(homeTelephone, Keys.CONTROL).sendKeys("a").keyUp(homeTelephone, Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();

		homeTelephone.sendKeys("0422-568960");

		// MOBILE

		WebElement mobileTelephone = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Mobile']/parent::div/following-sibling::div//input"));

		action.moveToElement(mobileTelephone).click().perform();

		action.keyDown(mobileTelephone, Keys.CONTROL).sendKeys("a").keyUp(mobileTelephone, Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();

		mobileTelephone.sendKeys("9885620002");

		// WORK PHONE

		WebElement workTelephone = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Work']/parent::div/following-sibling::div//input"));

		action.moveToElement(workTelephone).click().perform();

		action.keyDown(workTelephone, Keys.CONTROL).sendKeys("a").keyUp(workTelephone, Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();

		workTelephone.sendKeys("09888-56002-002");

		// WORK EMAIL

		WebElement workEmail = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Work Email']/parent::div/following-sibling::div//input"));

		action.moveToElement(workEmail).click().perform();

		action.keyDown(workEmail, Keys.CONTROL).sendKeys("a").keyUp(workEmail, Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.perform();

		workEmail.sendKeys("david.fincher-personal@yopmail.com");

		Thread.sleep(500);

		// OTHER EMAIL

		WebElement otherEmail = driver.findElement(By.xpath(
				"//label[contains(@class,'oxd-label') and text()='Other Email']/parent::div/following-sibling::div//input"));

		action.moveToElement(otherEmail).click().perform();

		action.keyDown(otherEmail, Keys.CONTROL).sendKeys("a").keyUp(otherEmail, Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.perform();

		otherEmail.sendKeys("david.fincher-other@yopmail.com");
		
		Thread.sleep(500);

		// ATTACHMENTS

		WebElement attachmentsCD = driver
				.findElement(By.xpath("//h6[text()='Attachments']/following-sibling::button/i"));
		
		action.moveToElement(attachmentsCD).click().perform();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.oxd-file-input")));

		WebElement fileInput = driver.findElement(By.cssSelector("input.oxd-file-input"));

		String filePath = System.getProperty("user.dir") + "\\Attachments\\Fincher Image.png";
		
		fileInput.sendKeys(filePath);
		
		Thread.sleep(500);

		// SAVE BUTTON

		WebElement saveButton2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		action.moveToElement(saveButton2).click().perform();

		// oxd-toaster_1

		WebElement toasterSuccessCD = driver.findElement(By.id("oxd-toaster_1"));

		String toasterSuccessCDMessage = toasterSuccessCD.getText();

		System.out.println(toasterSuccessCDMessage);

	}

}
