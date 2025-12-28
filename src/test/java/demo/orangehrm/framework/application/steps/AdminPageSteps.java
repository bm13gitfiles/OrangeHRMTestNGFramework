package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import demo.orangehrm.framework.application.elements.AdminpageElements;

public class AdminPageSteps extends AdminpageElements {
	
	
	public AdminPageSteps(WebDriver driver) {
		super(driver);
	}
	


	public void clickAddUserButton() {
		waitForTheElementToBeVisible(addUserButton);
		mouseClick(addUserButton);
		log("INFO", "Add user button clicked");
	}

	
	
	public void selectUserRoleAsAdmin() {
	    waitForTheElementToBeVisible(userRoleDropdown);
	    mouseClick(userRoleDropdown);
	    waitForTheElementToBeVisible(adminRoleFromDropdown);
	    mouseClick(adminRoleFromDropdown);
	    threadWait(500);
	    log("INFO", "Admin role selected");
	}
	

	public void enterEmployeeName(String name) {
	    waitForTheElementToBeVisible(employeeNameInput);
	    employeeNameInput.click();
	    employeeNameInput.sendKeys(name);
	    waitForTheElementToBeVisible(employeeNameSuggestion);
	    mouseClick(employeeNameSuggestion);
	    threadWait(2000);
	    log("INFO", "Employee Name Entered");
	}

	public void enterUsername(String username) {
	    waitForTheElementToBeVisible(usernameInput);
	    usernameInput.click();
	    usernameInput.sendKeys(username);
	    threadWait(2000);
	    log("INFO", "User Name Entered");
	}

	public void selectStatusEnabled() {
	    waitForTheElementToBeVisible(statusDropdown);
	    mouseClick(statusDropdown);
	    waitForTheElementToBeVisible(enabledStatusOption);
	    mouseClick(enabledStatusOption);
	    threadWait(2000);
	    log("INFO", "Enabled status selected");
	}

	public void enterPassword(String password) {
	    waitForTheElementToBeVisible(passwordInput);
	    threadWait(1000);
	    passwordInput.sendKeys(password);
	    threadWait(2000);
	    log("INFO", "Password Entered");
	}

	public void enterConfirmPassword(String password) {
	    waitForTheElementToBeVisible(confirmPasswordInput);
	    threadWait(1000);
	    confirmPasswordInput.sendKeys(password);
	    threadWait(2000);
	    log("INFO", "Confirm Password Entered");
	}

	public void clickSubmitButton() {
	    waitForTheElementToBeVisible(submitButton);
	    mouseClick(submitButton);
	    threadWait(2000);
	    log("INFO", "Submit Button Clicked");
	}
	
	
	public void validateToaster() {
		waitForTheElementToBeVisible(toasterMessage);
		String toasterText = getText(toasterMessage);
		log("INFO", "Toaster message displayed = "+toasterText);
		
	}
	
	
	//SEARCH USER
	
	
	public void initiateSearchinAdminPage() {
		launchPagebyURL("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		threadWait(2000);
		log("INFO", "Search Initiated");
		
		
	}
	
	
	public void enterUsernameInSearch(String searchUsername) {
		explicitWait(searchUserNameBy);
		sendKeys(searchUserName, searchUsername);
		threadWait(2000);
		log("INFO", "Username Entered");
	}
	
	public void enterUserRoleInSearch() {
		explicitWait(searchUserRoleBy);
		click(searchUserRole);
		explicitWait(searchAdminRoleSelectionBy);
		mouseClick(searchAdminRoleSelection);
		threadWait(2000);
		log("INFO", "User Role Entered");
	}
	
	public void enterEmployeeNameInSearch(String employeeName) {
		scrollToTheTop();
		moveToElementAndSendKeys(searchEmployeeName, employeeName);
		explicitWait(searchEmployeeNameSelection);
		mouseClick(searchEmployeeNameSelection);
		threadWait(1000);
		log("INFO", "Employee name entered in search");
	}
	
	
	public void enterStatusInSearch() {
		scrollToTheTop();
		mouseClick(searchStatus);
		explicitWait(searchEnabledStatusSelection);
		jsClick(searchEnabledStatusSelection);
		threadWait(1000);
		log("INFO", "Enabled status entered");
	}
	
	
	public void resetSearch() {
		scrollToTheTop();
		mouseClick(searchFormResetButton);
		threadWait(2000);
		log("INFO", "Search resetted");
	}
	
	public void clickSearchButton() {
		scrollToTheTop();
		click(searchFormSearchButton);
		threadWait(1000);
		log("INFO", "Search button clicked");
	}
	
	
	

	
	
		
}
