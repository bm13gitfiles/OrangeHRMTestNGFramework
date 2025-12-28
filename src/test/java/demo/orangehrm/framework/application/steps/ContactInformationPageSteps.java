package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.orangehrm.framework.application.elements.ContactInformationPageElements;
import demo.orangehrm.framework.web.commons.WebCommons;

public class ContactInformationPageSteps extends ContactInformationPageElements {
	
	public ContactInformationPageSteps(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	
	//Update Contact Information
	
	
	public void navigateToContactDetailsForm() {
		click(contactDetailsPIM);
		threadWait(2000);
		log("INFO", "Navigated to Contact Information form");
	}
	
	
	public void updateStreet1FieldInContactInformationForm() {
		moveToElementAndSendKeys(street1ContactInfo, "The Chapter Office");
		threadWait(1000);
		log("INFO", "Street 1 entered in Contact Information form");
	}
	
	
	public void updateStreet2FieldInContactInformationForm() {
		moveToElementAndSendKeys(street2ContactInfo, "Westminster Abbey");
		threadWait(1000);
		log("INFO", "Street 2 entered in Contact Information form");
	}
	
	
	public void updateCityFieldInContactInformationForm() {
		moveToElementAndSendKeys(cityContactInfo, "20 Dean's Yard");
		threadWait(1000);
		log("INFO", "City entered in Contact Information form");
	}
	
	public void updateStateProvinceFieldInContactInformationForm() {
		moveToElementAndSendKeys(stateProvinceContactInfo, "London");
		threadWait(1000);
		log("INFO", "State / Province entered in Contact Information form");
	}
	
	public void updateZIPPostalCodeFieldInContactInformationForm() {
		moveToElementAndSendKeys(zipPostalContactInfo, "SW1P 3PA");
		threadWait(1000);
		log("INFO", "ZIP /Postal Code entered in Contact Information form");
	}
	
	
	public void updateCountryInContactInformationForm() {
		mouseClick(countrySelectorContactInfo);
		explicitWait(countrySelectorfromDropdownContactInfo);
		click(countrySelectorfromDropdownContactInfo);
		threadWait(1000);
		log("INFO", "Country selected in Contact Information form");
	}
	
	
	public void updateHomeTelephoneInContactInformationForm() {
		moveToElementAndSendKeys(homeTelephoneContactInfo, "0422-895623");
		threadWait(1000);
		log("INFO", "Home / Telephone Entered in Contact Information form");
	}
	
	public void updateMobileTelephoneInContactInformationForm() {
		moveToElementAndSendKeys(mobileTelephoneContactInfo, "987845245503056");
		threadWait(1000);
		log("INFO", "Mobile / Telephone Entered in Contact Information form");
	}
	
	
	public void updateWorkTelephoneInContactInformationForm() {
		moveToElementAndSendKeys(workTelephoneContactInfo, "887845245503056");
		threadWait(1000);
		log("INFO", "Work / Telephone Entered in Contact Information form");
	}	
	
	
	public void updateWorkEmailInContactInformationForm() {
		moveToElementAndSendKeys(workEmailContactInfo, "dirfincherwork@mailinator.com");
		threadWait(1000);
		log("INFO", "Work Email Entered in Contact Information form");
	}	
	
	
	public void updateOtherEmailInContactInformationForm() {
		mouseClick(workEmailContactInfo);
		moveToElementAndSendKeys(otherEmailContactInfo, "dirfincherotherEmail@mailinator.com");
		threadWait(1000);
		log("INFO", "Other Email Entered in Contact Information form");
	}	
	

	public void addAttachmentInContactInformationForm(String imgpath) {
		singleClick(addAttachmentContactInfo);
		log("INFO", "Add button Clicked");
		explicitWait(browseAttachmentButtonContactInfoby);
		sendKeys(browseAttachmentButtonContactInfo, imgpath);
		threadWait(1000);
		log("INFO", "Attachments added to Contact Information Form");
	}
	
	public void clickSaveAttachmentButton() {
		explicitWait(saveAttachmentButtonContactInfo);
		click(saveAttachmentButtonContactInfo);
		log("INFO", "Attachments saved");
	}
	
	
	public void verifySuccessToasterInContactInformationForm() {
		explicitWait(toaster);
		String successMessage = getText(toasterMessage);
		log("INFO", "Toaster displayed with the message "+successMessage);
	}
	
	
	
}


