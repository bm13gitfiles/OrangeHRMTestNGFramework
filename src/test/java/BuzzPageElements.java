import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuzzPageElements {
        
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();

    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	Actions actions = new Actions(driver);

    	// Navigate to Buzz
    	WebElement buzzMenu = wait.until(ExpectedConditions.elementToBeClickable(
    	    By.xpath("//div[@class='oxd-sidepanel-body']//span[text()='Buzz']")));
    	js.executeScript("arguments[0].click();", buzzMenu);

    	// Open Share Photos modal
    	WebElement sharePhotosBtn = wait.until(ExpectedConditions.elementToBeClickable(
    	    By.xpath("//button[contains(text(),'Share Photos')]")));
    	js.executeScript("arguments[0].click();", sharePhotosBtn);

    	WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(
    	    By.cssSelector("div.orangehrm-dialog-modal")));

    	// Enter text
    	WebElement textarea = wait.until(ExpectedConditions.presenceOfElementLocated(
    	    By.xpath(("//div[@class='oxd-buzz-post oxd-buzz-post--active']//textarea[@class='oxd-buzz-post-input'])[2]"))));
    
    	
    	textarea.sendKeys("This is Fincher Appreciation Post");

    	// Upload photo
    	WebElement fileInput = driver.findElement(By.xpath("//div[contains(@class,'orangehrm-photo-input')]//input[@type='file']")
    		);

    	fileInput.sendKeys(System.getProperty("user.dir") + "\\Attachments\\David-Fincher-png.png");
    	
    	Thread.sleep(2000);
    	
    	
    	// Click Share
    	WebElement shareBtn = wait.until(ExpectedConditions.elementToBeClickable(
    	    By.xpath("//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']/button")));
    	
    	
    	actions.moveToElement(shareBtn).click();

    	// Verify post
    	wait.until(ExpectedConditions.visibilityOfElementLocated(
    	    By.xpath("//p[contains(text(),'Automation test post')]")));
    }
}
