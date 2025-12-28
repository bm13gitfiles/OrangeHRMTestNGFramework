import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MembershipsPageElements {
		
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
			
			driver.findElement(By.xpath("//span[text()='My Info']/parent::a")).click();
			
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Memberships']")));
			
			driver.findElement(By.xpath("//a[text()='Memberships']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h6[text()='Assigned Memberships']/parent::div/button")).click();
			
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//label[text()='Membership']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']"),0));
			
			driver.findElement(By.xpath("//label[text()='Membership']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")).click();
			
			
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='British Computer Society (BCS)']//parent::div"), 0));
			
			driver.findElement(By.xpath("//span[text()='British Computer Society (BCS)']//parent::div")).click();
			
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//label[text()='Subscription Paid By']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")).click();
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Company']//parent::div"), 0));
			
			driver.findElement(By.xpath("//span[text()='Company']//parent::div")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//label[text()='Subscription Amount']//parent::div//parent::div//input")).sendKeys("198765234");
			
			Thread.sleep(2000);
			
			
			//Currency
			
			
			driver.findElement(By.xpath("//label[text()='Currency']//parent::div//parent::div//div[@class='oxd-select-text oxd-select-text--active']")).click();
			
wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Swaziland Lilangeni']//parent::div"), 0));
			
			driver.findElement(By.xpath("//span[text()='Swaziland Lilangeni']//parent::div")).click();
			
			
			Thread.sleep(2000);
			
			
			//Subscription Commence Date
			
			WebElement subscriptionDate = driver.findElement(By.xpath("//label[text()='Subscription Commence Date']//parent::div//parent::div//input"));
			
			subscriptionDate.sendKeys("2021-13-12");
			
			Thread.sleep(2000);
			
			//Subscription Renewal date
			
			
			WebElement subscriptionRenewalDate = driver.findElement(By.xpath("//label[text()='Subscription Renewal Date']//parent::div//parent::div//input"));
			
			subscriptionRenewalDate.sendKeys("2024-13-12");
			
			
			Thread.sleep(2000);
			
			
			WebElement saveButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and text()=' Save ']"));
			
			saveButton.click();
			
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("oxd-toaster_1"), 0));
			
			String toastMessage = driver.findElement(By.cssSelector("p.oxd-text.oxd-text--p.oxd-text--toast-message.oxd-toast-content-text")).getText();
			System.out.println(toastMessage);
			
				driver.quit();


	}

}
