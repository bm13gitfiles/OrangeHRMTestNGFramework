package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import demo.orangehrm.framework.application.elements.ForgotPasswordElements;

public class ForgotPasswordSteps extends ForgotPasswordElements {

	public ForgotPasswordSteps(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyResetPasswordPageTitle() {
		waitForTheElementToBeVisible(resetPasswordTitle);
		if(resetPasswordTitle.getText().equals("Reset Password")) {
			log("PASS", "Reset password page title validated and passed");
		}
		
		else {
			log("FAIL", "Reset password page title validated and FAILED");
		}
	}
	
	
	public void enterUsernameinResetPasswordForm(String username) {
		enterText(usernameField, username);
	}
	
	
	public void clickResetPasswordButton() {
		click(resetPasswordButton);
		waitForTheElementToBeVisible(resetPasswordSuccessfulMessage);
		log("PASS", "Password reset Successful");
	}
	

}
