import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMTest2PIM2 extends OrangeHRMTest {

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
		
		
//		13. Update personal information within the my info page and save them.
		
		
		WebElement pimMenu = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
		
		pimMenu.click();
		
		WebElement firstCustomerPIM = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"));
		
		firstCustomerPIM.click();
		
		WebElement personalDetailsform = driver.findElement(By.xpath("//a[text()='Personal Details']"));
		
		personalDetailsform.click();
		
		WebElement reportToPIM = driver.findElement(By.xpath("//a[text()='Report-to']"));
		
		reportToPIM.click();
		
		Thread.sleep(1000);
		
		WebElement addSupervisorButton = driver.findElement(By.xpath("//div[@class='orangehrm-action-header']//h6[text()='Assigned Supervisors']//..//i"));
		
		addSupervisorButton.click();
		
		Thread.sleep(1000);
		
		WebElement supervisorNameInputBy = driver.findElement(By.xpath("//label[text()='Name']//..//..//input"));
		
		supervisorNameInputBy.click();
		
		supervisorNameInputBy.sendKeys("John");
		
		
		
		By selSuprvsrBy = By.xpath("//div[@role='listbox']//span");
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(selSuprvsrBy, 0));
		
		WebElement selectSupervsiorNameBy = driver.findElement(By.xpath("//div[@role='listbox']//span"));
		
		selectSupervsiorNameBy.click();
		
		
		
//		WebElement myInfoMenu = driver.findElement(By.xpath("//span[text()='My Info']"));
//		
//		myInfoMenu.click();
		
		
		
		
//		14. Update contact details information within the my info page along with attachments and save them.

	}

}
