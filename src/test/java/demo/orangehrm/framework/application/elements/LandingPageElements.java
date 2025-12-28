package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demo.orangehrm.framework.web.commons.WebCommons;

public class LandingPageElements extends WebCommons {

    protected WebDriver driver;

    public LandingPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Only needed here
    }

    // Locators
    public By copyrightText1By = By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]");
    public By copyrightText2By = By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[2]");
    public By homepageLogoby = By.xpath("//img[@alt='client brand banner']");

    // WebElements
    
    
    @FindBy(css="img[alt='client brand banner']")
    public WebElement homePageLogo;
    
    @FindBy(xpath = "//img[@alt='company-branding']")
    public WebElement orangeHRMLogo;

    @FindBy(css = "input[placeholder='Username']")
    public WebElement usernameField;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(css = ".orangehrm-login-forgot")
    public WebElement forgotYourPasswordLink;

    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]")
    public WebElement copyrightText1;

    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[2]")
    public WebElement copyrightText2;

    @FindBy(xpath = "//div[@class='orangehrm-login-footer-sm']")
    public WebElement footerSocialMediaIcons;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
    public WebElement linkedInIcon;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//a[@href='https://twitter.com/orangehrm?lang=en']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
    public WebElement youTubeIcon;
    
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement invalidCredentialsMessage;
    
    //Forgot Password Page Elements
    
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    public WebElement resetPasswordTitle;
    
}
