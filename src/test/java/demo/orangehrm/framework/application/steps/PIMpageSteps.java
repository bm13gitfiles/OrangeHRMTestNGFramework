package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.application.elements.PIMpageElements;

public class PIMpageSteps extends PIMpageElements {
	
	public PIMpageSteps(WebDriver driver){
		super(driver);
	}
	
	
	//Add new user in PIM Form
	
	public void navigateToPIMform() {
		explicitWait(pimSideBarBy);
		click(pimSideBar);
		log("INFO", "PIM Sidebar Clicked");
		threadWait(2000);

	}
	
	public void clickAddNewUserButton() {
		explicitWait(addNewUserPimButtonBy);
		click(addNewUserPimButton);
		log("INFO", "Add new user button clicked");
	}
	
	public void uploadProfileImage(String path) {
		sendKeys(profileImagePIM, path);
		log("INFO", "Profile picture updated");
	}
	
	public void enterFirstName(String firstName) {
		sendKeys(firstNamePIM, firstName);
		log("INFO", "FirstName entered");
	}
	
	public void enterMiddleName(String middleName) {
		singleClick(middleNamePIM);
		sendKeys(middleNamePIM, middleName);
		log("INFO", "MiddleName entered");
	}
	
	
	public void enterLastName(String lastName) {
		singleClick(lastNamePIM);
		sendKeys(lastNamePIM, lastName);
		log("INFO", "LastName entered");
	}
	
	
	public void enableCreateLoginDetailsCheckbox() {
		explicitWait(createLoginDetailsCheckboxBy);
		singleClick(createLoginDetailsCheckboxPIM);
		log("INFO", "Create Login Details Checkbox Checked");
	}
	
	
	public void enterUserName(String userName) {
		explicitWait(userNamePIMby);
		moveToElementAndSendKeys(userNamePIM, userName);
		log("INFO", "Username entered");
	}
	
	
	public void enterPassword(String password) {
		explicitWait(passwordPIMBy);
		moveToElementAndSendKeys(passwordPIM, password);
		log("INFO", "Password entered");
	}
	
	
	public void enterConfirmPassword(String password) {
		explicitWait(confirmPasswordPIMBy);
		moveToElementAndSendKeys(confirmPasswordPIM, password);
		log("INFO", "Confirm password entered");
	}
	
	
	
	
	public void clickSubmitButton() {
		singleClick(submitButtonPIM);
		log("INFO", "Submit button Clicked");
	}
	
	
	public void validatetoasterMessage() {
		waitForTheElementToBeVisible(toaster);
		String toasterMessageDisplayed = getText(toasterMessage);
		log("INFO", toasterMessageDisplayed);
		
	}
	
	
	
	
	
	
	
	
	//PIM Search
	
		public void initiatePIMSearch() {
			singleClick(pimSideBar);
			log("INFO", "PIM Search initiated");
			threadWait(1000);
		}
		
		
		public void enterEmployeeNameInSearchForm(String text) {
			explicitWait(employeeNamePIMSearchBy);
			moveToElementAndSendKeys(employeeNamePIMSearch, text);
			log("INFO", "Employee Name Entered");
			explicitWait(userSelectionPIMSearchBy);
			String selectedUser = getText(userSelectedPIM);
			jsClick(employeeNameFirstSuggestion);
			log("INFO", "Employee Name First suggestion clicked");
			log("INFO", "Selected User = "+selectedUser);
			threadWait(1000);
		}
		
		
		
		
		public void enterEmployeeIDinPIMForm(String employeeID) {
			scrollToTheTop();
			moveToElementAndSendKeys(employeeIDPIM, employeeID);
			log("INFO", "Employee ID entered");
			threadWait(1000);
		}
		
		
		public void selectEmployeeStatusInPIMForm() {
			scrollToTheTop();
			mouseClick(employeeStatusPIM);
			log("INFO", "Employee Status Clicked");
			explicitWait(selectFreeLanceStatusBy);
			mouseClick(selectFreeLanceStatus);
			log("INFO", "Freelance Status selected");
			threadWait(1000);
		}
		
		
		
		public void enterSupervisorNameInPIMSearchform(String supervisor) {
			moveToElementAndSendKeys(supervisorNamePIM, supervisor);
			log("INFO", "Supervisor Name field Clicked");
			explicitWait(selectSupervisorNameBy);
			click(selectSupervisorNamePIMSearch);
			log("INFO", "Supervisor Name Entered");
			threadWait(1000);
		}
		
		
		public void selectJobTitle() {
			singleClick(jobTitle);
			explicitWait(jobTitleOptionsSelectBy);
			click(jobTitleOptions);
			log("INFO", "Job Title Selected");
			threadWait(1000);
		}
		
		
		public void selectSubUnit() {
			singleClick(subUnitDropdown);
			click(selectSubUnitPIM);
			log("INFO", "Sub unit selected");
			threadWait(1000);
		}
		
		public void clickSearchButton() {
			singleClick(searchButtonPIM);
		}
		
		public void clickResetButtoninPIMForm() {
			singleClick(resetButtonPIM);
			log("INFO", "PIM Search resetted");
			threadWait(1000);
		}
	
		
		
		// Edit Personal Information in PIM Form - Steps
		
		public void openCustomerProfile() {
			click(firstCustomerinList);
			threadWait(2000);
			log("INFO", "First Customer in the list selected");
		}
		
		
		public void navigateToPersonalDetailsForm() {
			click(personalDetailsPIM);
			threadWait(2000);
			log("INFO", "Navigated to Personal Details form");
		}
		
		
		public void addProfilePicInPersonalInformationForm(String imgpath) {
			
			//String filePath = System.getProperty("user.dir") + "\\Attachments\\David-Fincher-png.png";
			click(profilepictureInPersonalInfoForm);
			enterTextKeypad(profilepictureInPersonalInfoForm, imgpath);
			threadWait(1000);
			log("INFO", "Employee ID entered in Personal Information form");
		}
		
		
		public void enterFirstNameInPersonalInformationForm(String firstName) {
			click(firstNamePersonalInfoForm);
			clearTheInputBox(firstNamePersonalInfoForm);
			moveToElementAndSendKeys(firstNamePersonalInfoForm, firstName);
			threadWait(1000);
			log("INFO", "First name entered in Personal Information form");
		}
			
			public void enterMiddleNameInPersonalInformationForm(String middleName) {
				clearTheInputBox(middleNamePersonalInfoForm);
				mouseClick(middleNamePersonalInfoForm);
				moveToElementAndSendKeys(middleNamePersonalInfoForm, middleName);
				threadWait(1000);
				log("INFO", "Middle name entered in Personal Information form");
		}
			
			
			public void enterLastNameInPersonalInformationForm(String lastName) {
				clearTheInputBox(lastNamePersonalInfoForm);
				mouseClick(lastNamePersonalInfoForm);
				moveToElementAndSendKeys(lastNamePersonalInfoForm, lastName);
				threadWait(1000);
				log("INFO", "Last name entered in Personal Information form");
		}
			
			
			
			public void enterEmployeeIDinPersonalInfoForm(String employeeID) {
				clearTheInputBox(employeeIDPersonalInfoForm);
				mouseClick(employeeIDPersonalInfoForm);
				moveToElementAndSendKeys(employeeIDPersonalInfoForm, employeeID);
				threadWait(1000);
				log("INFO", "Employee ID entered in Personal Information form");
			}
			
			
			public void enterOtherIDinPersonalInfoForm(String otherID) {
				clearTheInputBox(otherIDPersonalInfoForm);
				mouseClick(otherIDPersonalInfoForm);
				moveToElementAndSendKeys(otherIDPersonalInfoForm, otherID);
				threadWait(1000);
				log("INFO", "Other ID entered in Personal Information form");
			}
			
		
		
			public void enterDriverlicenseNumberInPersonalInfoForm() {
				clearTheInputBox(driverLicenseNumberInPersonalInfoForm);
				mouseClick(driverLicenseNumberInPersonalInfoForm);
				moveToElementAndSendKeys(driverLicenseNumberInPersonalInfoForm, "CFGHJKIO6756");
				threadWait(2000);
				log("INFO", "Driving license number entered");
			}
			
			
			public void enterLicenseExpiryDateInPersonalInformationForm() {
				clearTheInputBox(licenseExpiryDateInPersonalInfoForm);
				mouseClick(licenseExpiryDateInPersonalInfoForm);
				moveToElementAndSendKeys(licenseExpiryDateInPersonalInfoForm, "2035-04-04");
				threadWait(1000);
				log("INFO", "First name entered in Personal Information form");
			}
			
			
			public void enterNationalityinPersonalInfoForm() {
				mouseClick(nationalityInPersonalInfoForm);
				explicitWait(eastTimorseNationality);
				click(eastTimorseNationality);
				threadWait(1000);
				log("INFO", "East Timorse Nationality selected");
			}
			
			
			public void selectMaritalStatusInPersonalInfoForm() {
				click(maritalStatusInPersonalInfoForm);
				explicitWait(otherMaritalStatusInPersonalInfoForm);
				click(otherMaritalStatusInPersonalInfoForm);
				threadWait(1000);
				log("INFO", "Marital status selected in Personal Information form");
			}
			
			
			public void enterDateOfBirthInPersonalInformationForm() {
				clearTheInputBox(dateOfBirthInPersonalInfoForm);
				mouseClick(dateOfBirthInPersonalInfoForm);
				moveToElementAndSendKeys(dateOfBirthInPersonalInfoForm, "1990-04-04");
				threadWait(1000);
				log("INFO", "Date of Birth in Personal Information form");
			}
			
			
			public void selectGenderInPersonalInformationForm() {
				mouseClick(firstGenderInPersonalInfoForm);
				threadWait(1000);
				log("INFO", "Gender selected in Personal Information form");
			}
			
			
			public void clickSaveButton() {
				mouseClick(saveButtonInPersonalInfoForm);
				threadWait(1000);
				log("INFO", "Save button Clicked in Personal Information form");
			}
			
			public void verifySuccessToasterIsDisplayed() {
				explicitWait(toaster);
				String successMessage = getText(toasterMessage);
				log("INFO", "Toaster displayed with the message "+successMessage);
			}
		
			
			// Add supervisor steps
			
			public void navigateToReportToPage() {
				click(reportToOption);
				log("INFO", "Supervisor addition page opened");
				threadWait(1000);
			}
			
			
			public void clickAddSupervisorButton() {
				mouseClick(addSupervisorButton);
				log("INFO", "Supervisor addition button clicked");
				threadWait(1000);
			}
			
			
			public void selectSupervisorName(String supervisor) {
				explicitWait(supervisorNameInputBy);
				click(supervisorNameInput);
				enterText(supervisorNameInput, supervisor);
				explicitWait(selectSupervisorNameSelBy);
				click(selectSupervisorNameSel);
				log("INFO", "Supervisor name selected");
				threadWait(1000);
			}
			
			
			public void selectReportingMethod() {
				explicitWait(reportingMethod);
				click(reportingMethod);
				explicitWait(directMethodSelectionBy);
				click(directMethodSelection);
				log("INFO", "Reporting method selected");
				threadWait(1000);
			}
			
			
			public void clickSaveButtoninAddSupervisorForm() {
				scrollToElement(saveButtonAddSupervsior);
				jsClick(saveButtonAddSupervsior);
				log("INFO", "Save button Clicked in Add Supervisor form");
			}
			
			
			public void verifySuccessToasterIsDisplayedInAddSupervisorForm() {
				explicitWait(toaster);
				String successMessage = getText(toasterMessage);
				log("INFO", "Toaster displayed with the message "+successMessage);
			}
			
}
