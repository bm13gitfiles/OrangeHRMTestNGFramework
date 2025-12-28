package demo.orangehrm.framework.application.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.web.commons.WebCommons;

public class ForgotPasswordElements extends WebCommons {
	
	protected WebDriver driver;

    public ForgotPasswordElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }
    
    
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    public WebElement resetPasswordTitle;
    
    @FindBy(xpath="//h6[text()='Reset Password link sent successfully']")
    public WebElement resetPasswordSuccessfulMessage;
    
    
    @FindBy(name = "username")
    public WebElement usernameField;
    
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement resetPasswordButton;
    

}
