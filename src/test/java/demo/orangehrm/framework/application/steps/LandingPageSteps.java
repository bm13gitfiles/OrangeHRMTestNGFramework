package demo.orangehrm.framework.application.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import demo.orangehrm.framework.application.elements.LandingPageElements;
import demo.orangehrm.framework.constants.Constants;

public class LandingPageSteps extends LandingPageElements {

    public LandingPageSteps(WebDriver driver) {
        super(driver); // PageFactory already called in parent
    }

    public void goToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.timeout));
    }

    public void validateWebPageTitle() {
        try {
            String actualTitle = getTitleOfTheWebPage();
            String expectedTitle = "OrangeHRM";

            if (expectedTitle.equalsIgnoreCase(actualTitle)) {
                log("pass", "Web page title matched: " + actualTitle);
            } else {
                log("fail", "Web page title mismatch. Expected: " + expectedTitle + ", Found: " + actualTitle);
            }
        } catch (Exception e) {
            log("fail", "Exception during title validation: " + e.getMessage());
        }
    }

    public void enterUserName(String username) {
        enterText(usernameField, username);
        log("info", "Entered username: " + username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
        log("info", "Entered password");
    }

    public void clickLoginButtonWithValidCredentials() {
        mouseClick(loginButton);
        log("info", "Clicked login button");
        waitForTheElementToBeVisible(homePageLogo);
        String loggedinPage = getTitleOfTheWebPage();
        log("PASS","User logged in and navigated to "+loggedinPage);
    }
    
    public void clickLoginButtonWithInValidCredentials() {
        mouseClick(loginButton);
        log("info", "Clicked login button");
        waitForTheElementToBeVisible(invalidCredentialsMessage);
        log("PASS","Invalid Credentials error message displayed");
    }
    
    

    public void verifyCopyrightText1() {
        try {
            explicitWait(copyrightText1By);
            String actualText = copyrightText1.getText();
            String expectedText = "OrangeHRM OS 5.7";

            if (expectedText.equalsIgnoreCase(actualText)) {
                log("pass", "Copyright Text 1 matched");
            } else {
                log("fail", "Mismatch. Expected: " + expectedText + ", Found: " + actualText);
            }
        } catch (Exception e) {
            log("fail", "Exception verifying Copyright Text 1: " + e.getMessage());
        }
    }

    public void verifyCopyrightText2() {
        try {
            explicitWait(copyrightText2By);
            String actualText = copyrightText2.getText();
            String expectedText = "© 2005 - 2025 OrangeHRM, Inc. All rights reserved.";

            if (expectedText.equalsIgnoreCase(actualText)) {
                log("pass", "Copyright Text 2 matched");
            } else {
                log("fail", "Mismatch. Expected: " + expectedText + ", Found: " + actualText);
            }
        } catch (Exception e) {
            log("fail", "Exception verifying Copyright Text 2: " + e.getMessage());
        }
    }

    public void verifyOrangeHRMLogo() {
        try {
            waitForTheElementToBeVisible(orangeHRMLogo);
            log(orangeHRMLogo.isDisplayed() ? "pass" : "fail", "OrangeHRM logo visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying OrangeHRM logo: " + e.getMessage());
        }
    }

    public void verifySocialMediaIcons() {
        try {
            waitForTheElementToBeVisible(footerSocialMediaIcons);
            log(footerSocialMediaIcons.isDisplayed() ? "pass" : "fail", "Footer social media icons visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying social media icons: " + e.getMessage());
        }
    }

    public void verifyLinkedInIcon() {
        try {
            waitForTheElementToBeVisible(linkedInIcon);
            log(linkedInIcon.isDisplayed() ? "pass" : "fail", "LinkedIn icon visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying LinkedIn icon: " + e.getMessage());
        }
    }

    public void verifyFacebookIcon() {
        try {
            waitForTheElementToBeVisible(facebookIcon);
            log(facebookIcon.isDisplayed() ? "pass" : "fail", "Facebook icon visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying Facebook icon: " + e.getMessage());
        }
    }

    public void verifyTwitterIcon() {
        try {
            waitForTheElementToBeVisible(twitterIcon);
            log(twitterIcon.isDisplayed() ? "pass" : "fail", "Twitter icon visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying Twitter icon: " + e.getMessage());
        }
    }

    public void verifyYouTubeIcon() {
        try {
            waitForTheElementToBeVisible(youTubeIcon);
            log(youTubeIcon.isDisplayed() ? "pass" : "fail", "YouTube icon visibility check");
        } catch (Exception e) {
            log("fail", "Exception verifying YouTube icon: " + e.getMessage());
        }
    }
    
    
    
    public void clickForgotPasswordLink() {
        click(forgotYourPasswordLink);
        try {
            waitForTheElementToBeVisible(resetPasswordTitle);
            if (resetPasswordTitle != null && resetPasswordTitle.isDisplayed()) {
                log("pass", "User navigated to Forgot Password page successfully");
            } else {
                log("fail", "Reset Password title not displayed");
            }
        } catch (TimeoutException e) {
            log("fail", "Reset Password title not visible within timeout: " + e.getMessage());
        } catch (Exception e) {
            log("fail", "Unexpected error while navigating to Forgot Password page: " + e.getMessage());
        }
    }
    
    
    public void loginToTheApplication() {
    	enterText(usernameField, "Admin");
    	enterText(passwordField, "admin123");
    	loginButton.click();
    	threadWait(1000);
    	log("info", "User logged into the Application");
    }
    
    
    
    
    
}
