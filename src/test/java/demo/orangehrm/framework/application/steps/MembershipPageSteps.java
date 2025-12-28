package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import demo.orangehrm.framework.application.elements.MembershipPageElements;
import demo.orangehrm.framework.application.elements.PIMpageElements;

public class MembershipPageSteps extends MembershipPageElements {
	
	public MembershipPageSteps(WebDriver driver){
		super(driver);
	}
	
	
	//MEMBERSHIP PAGE STEPS 
	
		public void navigateToMyInfoPage() {
			explicitWait(myInfoLink);
			click(myInfoLink);
			explicitWait(membershipsLink);
			log("INFO", "Navigated to My Info page");
		}
		
		
		public void navigateToMembershipPage() {
			explicitWait(membershipsLink);
			click(membershipsLink);
			explicitWait(viewMembershipPage);
			threadWait(1000);
			log("INFO", "Navigated to View Memberships page");
		}
		
		
		
		public void ClickAddMembershipButton() {
			explicitWait(addMembershipButton);
			click(addMembershipButton);
			explicitWait(addMembershipPage);
			threadWait(1000);
			log("INFO", "Navigated to Add Membership page");
		}
		
		
		
		public void selectMembershipType() {
			explicitWait(membershipType);
			click(membershipType);
			explicitWait(britishComputerSocietyMembershipType);
			click(britishComputerSocietyMembershipType);
			log("INFO", "Selected Membership Type as British Computer Society");
			threadWait(1000);
		}
		
		
		
		public void selectSubscriptionPaidBy() {
			explicitWait(subscriptionPaidBy);
			click(subscriptionPaidBy);
			explicitWait(companySubscriptionPaidBy);
			click(companySubscriptionPaidBy);
			log("INFO", "Subscription paid by selected as Company");
		}
		
		
		
		public void enterSubscriptionAmount() {
			explicitWait(subscriptionAmount);
			sendKeys(subscriptionAmount, "132639");
			log("INFO", "Entered Subscription Amount");
		}
		
		
		public void selectSubscriptionCurrency() {
			explicitWait(subscriptionCurrency);
			click(subscriptionCurrency);
			explicitWait(swazilandLilangeniCurrency);
			click(swazilandLilangeniCurrency);
			threadWait(1000);
			log("INFO", "Subscription Currency selected as Swaziland Lilangeni");
		}
		
		
		public void enterSubscriptionCommenceDate() {
			explicitWait(subscriptionCommenceDate);
			sendKeys(subscriptionCommenceDate, "2015-13-12");
			log("INFO", "Subscription Commence Date entered");
		}
		
		
		
		public void enterSubscriptionRenewalDate() {
			explicitWait(subscriptionRenewalDate);
			sendKeys(subscriptionRenewalDate, "2026-13-12");
			log("INFO", "Subscription Renewal Date entered");
		}
		
		public void clickSaveButton() {
			explicitWait(SaveButton);
			click(SaveButton);
			log("INFO", "Save Button Clicked");
		}
		
	    public void verifyToastMessageInMemberShipForm() {
	        String expectedMessage = "Successfully Saved";
	        Assert.assertEquals(toasterMessage, expectedMessage,
	            "Toast message did not match expected value.");
	        log("PASS", "Toast message verified: " + toasterMessage);
	    }
			
}
