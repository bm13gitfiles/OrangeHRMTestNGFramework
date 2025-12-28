package demo.orangehrm.framework.web.commons;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import demo.orangehrm.framework.base.BasePage;
import demo.orangehrm.framework.constants.Constants;
import demo.orangehrm.framework.file.utilities.PropUtil;
import demo.orangehrm.framework.reports.Reports;

public class WebCommons extends BasePage {
	
	//This class contains common web interaction methods for Selenium WebDriver
	
	public WebDriver driver = new BasePage().getDriver();

	public Properties prop = PropUtil.readData("Config.properties");
	
	public Constants constants = new Constants();

	public void launchTheURL() {
		String url = prop.getProperty("demoorangehrm.url");
		
		driver.get(url);
		String actualTitle = driver.getTitle();

	}
	
	public void launchPagebyURL(String url) {
		driver.get(url);
	}
	
	public void clickTab(WebElement element) {
		element.sendKeys(Keys.TAB);
	}

	
	
	public String getTitleOfTheWebPage() {
		String expectedTitle = prop.getProperty("demoorangehrm.title");
		String actualWebPageTitle = driver.getTitle();
		if (!actualWebPageTitle.equals(expectedTitle)) {
			Assert.fail("Application title does not match. Expected: " + expectedTitle + ", Actual: " + actualWebPageTitle);
		}
		return actualWebPageTitle;
		
		
	}
	
	//Common method to scroll to the top
	public void scrollToTheTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}
	
	//Common method to Just Click
	public void click(WebElement element) {
		element.click();
	}
	

	// Common method to scroll to an element
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	// Common method for JS Click on an element
	public void jsClick(WebElement element) {
		scrollToElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// Common method for JS Send Keys on an element

	public void jsSendKeys(WebElement element, String text) {
		scrollToElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + text + "';", element);
	}

	// Mouse Actions

	// Press Single Click on an element

	public void singleClick(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	// Press Double Click on an element
	public void doubleClick(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).doubleClick().perform();
	}

	// Press Right Click on an element
	public void rightClick(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).contextClick().perform();
	}

	public void hoverOverElement(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void copyTheContent(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.moveToElement(element).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	}

	public void pasteTheContent(WebElement element) {
		scrollToElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

	// Open new tab in the browser
	public void openNewTab() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		System.out.println("New tab opened in the browser");
	}

	// Open new window in the browser
	public void openNewWindow() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("n").keyUp(Keys.CONTROL).perform();
		System.out.println("New window opened in the browser");
	}

	// Handling Alerts
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert accepted successfully");
		} catch (NoSuchElementException e) {
			Assert.fail("No alert found to accept: " + e.getMessage());
		}
	}

	// Dismiss Alert
	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert dismissed successfully");
		} catch (NoSuchElementException e) {
			Assert.fail("No alert found to dismiss: " + e.getMessage());
		}
	}

	// Get Alert Text
	public String getAlertText() {
		Alert alert = driver.switchTo().alert();
		try {
			String alertText = alert.getText();
			System.out.println("Alert text: " + alertText);
			return alertText;
		} catch (NoSuchElementException e) {
			Assert.fail("No alert found to get text: " + e.getMessage());
			return null; // This line will not be reached due to Assert.fail, but added for completeness
		}
	}

	// Switch to Frame
	public void switchToFrame(WebElement frameElement) {
		scrollToElement(frameElement);
		try {
			driver.switchTo().frame(frameElement);
			System.out.println("Switched to frame: " + frameElement);
		} catch (NoSuchElementException e) {
			Assert.fail("Frame not found: " + e.getMessage());
		}
	}

	public void switchToDefaultContent() {
		try {
			driver.switchTo().defaultContent();
			System.out.println("Switched back to default content");
		} catch (NoSuchElementException e) {
			Assert.fail("Failed to switch back to default content: " + e.getMessage());
		}
	}

	// Switch to next window

	// File upload
	public void fileUpload(WebElement uploadElement, String fileName) {
		scrollToElement(uploadElement);
		if (uploadElement.isDisplayed() && uploadElement.isEnabled()) {
			uploadElement.sendKeys(System.getProperty("user.dir") + "/Files/" + fileName);
			System.out.println("File uploaded successfully: " + fileName);
		} else {
			Assert.fail(uploadElement + " is not displayed or enabled.");
		}
	}

	public void labelOfTheButtonbyTextValue(WebElement button, String expectedLabel) {
		scrollToElement(button);
		if (button.isDisplayed() && button.isEnabled()) {
			String actualLabel = button.getText();
			if (!actualLabel.equals(expectedLabel)) {
				Assert.fail("Button label does not match. Expected: " + expectedLabel + ", Actual: " + actualLabel);
			} else {
				System.out.println("Button label matches: " + actualLabel);
			}
		} else {
			Assert.fail(button + " is not displayed or enabled.");
		}

	}

	public void labelOfTheButtonbyAttributeValue(WebElement button, String attributeName, String expectedValue) {
		scrollToElement(button);
		if (button.isDisplayed() && button.isEnabled()) {
			String actualValue = button.getAttribute(attributeName);
			if (!actualValue.equals(expectedValue)) {
				Assert.fail("Button attribute value does not match. Expected: " + expectedValue + ", Actual: "
						+ actualValue);
			} else {
				System.out.println("Button attribute value matches: " + actualValue);
			}
		} else {
			Assert.fail(button + " is not displayed or enabled.");
		}

	}
	
	public void mouseClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}

	// Common method to verify the hyperlink of an element
	public void verifyHyperlink(WebElement element, String expectedURL) {
		scrollToElement(element);
		if (element.isDisplayed() && element.isEnabled()) {
			String actualURL = element.getAttribute("href");
			if (!actualURL.equals(expectedURL)) {
				Assert.fail("Hyperlink does not match. Expected: " + expectedURL + ", Actual: " + actualURL);
			} else {
				System.out.println("Hyperlink matches: " + actualURL);
			}
		} else {
			Assert.fail(element + " is not displayed or enabled.");
		}
	}

	// Common method to enter text in a text field
	public void enterText(WebElement inputField, String text) {

		scrollToElement(inputField);
		if (inputField.isDisplayed() && inputField.isEnabled()) {
			inputField.clear();
			inputField.sendKeys(text);
		} else {
			Assert.fail(inputField + " is not displayed or enabled.");
		}

	}
	
	public void moveToElementAndSendKeys(WebElement element, String text) {
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().sendKeys(text).perform();
	}
	
	
	public void clearTheInputBox(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		action.keyDown(element, Keys.CONTROL).sendKeys("a").keyUp(element, Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.perform();
	}
	
	public void sendKeys(WebElement element,String text) {
		element.sendKeys(text);
	}

	// Common method to enter text in a text field through mouse actions

	public void enterTextKeypad(WebElement element, String text) {
		Actions action = new Actions(driver);
		
		action.sendKeys(text);
	}

	// Common method to interact with Checkbox

	public void checkboxHandle(WebElement checkbox, boolean status) {
		if (checkbox.isSelected() != status) {
			checkbox.click();
		}
	}

	// Common method to interact with radio buttons
	public void radioButtonHandle(WebElement radioButton, boolean status) {
		if (radioButton.isSelected() != status) {
			scrollToElement(radioButton);
			if (radioButton.isDisplayed() && radioButton.isEnabled()) {
				radioButton.click();
			} else {
				Assert.fail(radioButton + " is not displayed or enabled.");
			}
		}
	}

	// Common method to interact with dropdown elements

	public void dropdownHandlebyIndex(WebElement dropdown, int index) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.selectByIndex(index);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	public void dropdownHandlebyValue(WebElement dropdown, String value) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.selectByValue(value);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	public void dropdownHandlebyVisibleText(WebElement dropdown, String visibleText) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.selectByVisibleText(visibleText);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	// Common method to deselect already selected options in a dropdown

	public void deselectAllDropdown(WebElement dropdown) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.deselectAll();
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	public void deselectDropdownByIndex(WebElement dropdown, int index) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.deselectByIndex(index);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	public void deselectDropdownByValue(WebElement dropdown, String value) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.deselectByValue(value);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	public void deselectDropdownByVisibleText(WebElement dropdown, String visibleText) {
		scrollToElement(dropdown);
		if (dropdown.isDisplayed() && dropdown.isEnabled()) {
			Select select = new Select(dropdown);
			select.deselectByVisibleText(visibleText);
		} else {
			Assert.fail(dropdown + " is not displayed or enabled.");
		}

	}

	// Common method to get text from an element

	public String getText(WebElement textElement) {
		scrollToElement(textElement);
		if (textElement.isDisplayed() && textElement.isEnabled()) {
			String text = textElement.getText();
			System.out.println("Extracted Text from " + textElement + " : " + text);
			return text;
		} else {
			Assert.fail(textElement + " is not displayed or enabled.");
			return null; // This line will not be reached due to Assert.fail, but added for completeness
		}

	}

	// Common method to get attribute value from an element
	public String getAttributeValue(WebElement element, String attributeName) {
		scrollToElement(element);
		if (element.isDisplayed() && element.isEnabled()) {
			String attributeValue = element.getAttribute(attributeName);
			System.out.println("Extracted Attribute Value from " + element + " : " + attributeValue);
			return attributeValue;
		} else {
			Assert.fail(element + " is not displayed or enabled.");
			return null; // This line will not be reached due to Assert.fail, but added for completeness
		}
	}

	// Common method to get the current URL of the page
	public String getCurrentURL() {
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		return currentURL;
	}

	// Common method to refresh the current page
	public void refreshPage() {
		driver.navigate().refresh();
		System.out.println("Page refreshed");
	}

	// Common method for waits

	// Thread Sleep wait

	public void threadWait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.err.println("Thread sleep interrupted: " + e.getMessage());
			Thread.currentThread().interrupt(); // Restore interrupted status
		}
		System.out.println("Slept for " + milliseconds + " milliseconds");
	}

	// Implicit wait

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(constants.timeout));
		System.out.println("Implicit wait set for " + constants.timeout + " seconds");
	}

	// Explicit wait

	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void explicitWait(By byLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.timeout));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(byLocator, 0));
	}
	
	public void waitForTheElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForTheElementToBeInvisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.timeout));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// Fluent wait

	public void fluentWait(By locator, int pollingEveryInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(constants.timeout));
		wait.pollingEvery(Duration.ofSeconds(pollingEveryInSeconds)).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// Common methods for logging messages
	public void log(String status, String message) {
	    if (Reports.logger == null) {
	        System.err.println("Logger is not initialized. Skipping Extent logging.");
	        return;
	    }

	    switch (status.toLowerCase()) {
	        case "pass":
	            Reports.logger.pass("INFO: " + message);
	            break;
	        case "fail":
	            Reports.logger.fail("FAIL: " + message);
	            Assert.fail("FAIL: " + message);
	            break;
	        case "info":
	            Reports.logger.info("INFO: " + message);
	            break;
	        case "warning":
	            Reports.logger.warning("WARNING: " + message);
	            break;
	        default:
	            Reports.logger.info("UNKNOWN STATUS: " + message);
	            break;
	    }
	}

	public static String takeScreenshot(WebDriver driver, String name) {
		String screenshotPath = System.getProperty("user.dir") + "/Screenshots/" + name + ".png";
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(screenshotPath));
			System.out.println("Screenshot taken: " + screenshotPath);
		} catch (IOException e) {
			System.err.println("Failed to take screenshot: " + e.getMessage());
		}
		return screenshotPath;
	}

}
