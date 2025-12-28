
package demo.orangehrm.framework.base;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Parameters; 

// Declaring the BasePage class which contains common setup and teardown methods for tests
public class BasePage {

    // Declaring a static WebDriver instance so it can be accessed globally within the class
    private static WebDriver driver;
    
    // This method runs before each test method to set up the browser
    
    
    @BeforeMethod(alwaysRun = true) // Ensures this method runs before every test method, even if groups are used
    @Parameters({"BROWSER"}) // Accepts a browser name from testng.xml as a parameter
    public void setUpBrowser(String browserName) {

        // If the browser name is "Chrome", initialize ChromeDriver
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }

        // If the browser name is "Edge", initialize EdgeDriver
        else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }

        // If the browser name is "Firefox", initialize FirefoxDriver
        else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        // If the browser name doesn't match any known browser, fail the test
        else {
            Assert.fail("Browser not supported"); // Stops execution and marks test as failed
        }
    }
    
    // This method is used to close the browser after test execution
    @AfterMethod
    public void tearDown() {
        if(driver != null) { // Check if driver is initialized
            driver.quit(); // Close all browser windows and safely end the session
        }
    }
    
    // Getter method to access the WebDriver instance from other classes - Allows other classes (like page objects or test classes) to use the browser instance initialized in BasePage.
    
    public static WebDriver getDriver() {
        return driver; // Returns the current WebDriver instance
    }
    
    // Setter method to manually assign a WebDriver instance if needed
    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver; // Assigns the passed driver to the static driver variable
    }
}
