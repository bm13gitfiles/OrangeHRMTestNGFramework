package demo.orangehrm.framework.application.tests;
import org.testng.annotations.Test;

public class ApplicationTests extends BaseTests {
	
	//1. First, verify the logo from this particular Login  page. 
	@Test(priority = 1)
	public void verifyLogoInLoginPage() {
		landingpage.goToLoginPage();
		landingpage.verifyOrangeHRMLogo();
		
	}
	
	
	
//	2. Verify login page header, copyright details, and icons displayed related to social media.
	
	@Test(priority = 2)
	public void verifyHeaderCopyRightAndIcons() {
		landingpage.goToLoginPage();
		landingpage.getTitleOfTheWebPage();
		landingpage.verifyCopyrightText1();
		landingpage.verifyCopyrightText2();
		landingpage.verifySocialMediaIcons();
		landingpage.verifyLinkedInIcon();
		landingpage.verifyFacebookIcon();
		landingpage.verifyTwitterIcon();
		landingpage.verifyYouTubeIcon();
		
	}
	
	
//	3. Verify the login process within this Orange HRM with Valid credentials
	@Test(dataProvider = "TestDataProvider", priority = 3)
	public void loginWithValidCredentials(String username, String password) {
		landingpage.goToLoginPage();
		landingpage.enterUserName(username);
		landingpage.enterPassword(password);
		landingpage.clickLoginButtonWithValidCredentials();
		
	}
	
	
	
//	4. Verify the login process within this Orange HRM with Invalid credentials
	@Test(dataProvider = "TestDataProvider", priority = 4)
	public void loginWithInValidCredentials(String username, String password) {
		landingpage.goToLoginPage();
		landingpage.enterUserName(username);
		landingpage.enterPassword(password);
		landingpage.clickLoginButtonWithInValidCredentials();
		
	}
	
	
//	5. Verify forgot password feature
	@Test(dataProvider = "TestDataProvider", priority = 5)
	public void verifyForgotPasswordFeature(String email) {
		landingpage.goToLoginPage();
		landingpage.clickForgotPasswordLink();
		forgotPasswordSteps.verifyResetPasswordPageTitle();
		forgotPasswordSteps.enterUsernameinResetPasswordForm(email);
		forgotPasswordSteps.clickResetPasswordButton();
	}
	
	
//	6. Verify home page menus in left side bar
	@Test(priority=6)
	public void verifyHomepageMenusInLeftSideBar() {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		homePage.verifyAdminSideBarDisplayedInSidePanel();
		homePage.verifyBuzzSideBarDisplayedInSidePanel();
		homePage.verifyClaimSideBarDisplayedInSidePanel();
		homePage.verifyDashboardSideBarDisplayedInSidePanel();
		homePage.verifyDirectorySideBarDisplayedInSidePanel();
		homePage.verifyLeaveSideBarDisplayedInSidePanel();
		homePage.verifyMaintenanceSideBarDisplayedInSidePanel();
		homePage.verifyMyInfoSideBarDisplayedInSidePanel();
		homePage.verifyPerformanceSideBarDisplayedInSidePanel();
		homePage.verifyPimSideBarDisplayedInSidePanel();
		homePage.verifyRecruitmentSideBarDisplayedInSidePanel();
		homePage.verifyTimeSideBarDisplayedInSidePanel();
	}
	
//	7. Verify search user within the admin page along with results.
	@Test(dataProvider = "TestDataProvider", priority=9)
	public void searchUserInAdminPage(String username, String employeeName) {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		adminPage.initiateSearchinAdminPage();
		adminPage.enterUsernameInSearch(username);
		adminPage.enterUserRoleInSearch();
		adminPage.enterEmployeeNameInSearch(employeeName);
		adminPage.enterStatusInSearch();
		adminPage.clickSearchButton();
	}
	
	
//	8. Verify Reset Search Results in admin page
	@Test(dataProvider = "TestDataProvider", priority=8)
	public void resetSearchResults(String username, String employeeName) {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		adminPage.initiateSearchinAdminPage();
		adminPage.enterUsernameInSearch(username);
		adminPage.enterUserRoleInSearch();
		adminPage.enterEmployeeNameInSearch(employeeName);
		adminPage.enterStatusInSearch();
		adminPage.resetSearch();
	}
	
	
//	9. Verify "Add new user" within this admin page.
	@Test(dataProvider = "TestDataProvider", priority = 7)
	public void addUserInAdminPage(String employeeName, String password, String confirmPassword, String username) {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		homePage.navigateToAdminPage();
		adminPage.clickAddUserButton();
		adminPage.selectUserRoleAsAdmin();
		adminPage.enterEmployeeName(employeeName);
		adminPage.selectStatusEnabled();
		adminPage.enterPassword(password);
		adminPage.enterConfirmPassword(confirmPassword);
		adminPage.enterUsername(username);
		adminPage.clickSubmitButton();
		adminPage.validateToaster();
		
	}

	
	
//	10.Adding new employee information within the PIM page.
	@Test(dataProvider = "TestDataProvider", priority=10)
	public void addNewEmployeeInPIMpage(String firstName, String middleName, String lastName, String userName, String password) {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		pimPage.navigateToPIMform();
		pimPage.clickAddNewUserButton();
		pimPage.uploadProfileImage(System.getProperty("user.dir") + "\\Attachments\\David-Fincher-png.png");
		pimPage.enterFirstName(firstName);
		pimPage.enterMiddleName(middleName);
		pimPage.enterLastName(lastName);
		pimPage.enableCreateLoginDetailsCheckbox();
		pimPage.enterUserName(userName);
		pimPage.enterPassword(password);
		pimPage.enterConfirmPassword(password);
		pimPage.clickSubmitButton();
		pimPage.validatetoasterMessage();
	}
	
	
//	11. Update personal information within the my info page and save them.
	@Test(dataProvider = "TestDataProvider",priority=11)
		public void updatePersonalInformationMyInfo(String firstName, String middleName, String lastName, String employeeID, String otherID, String supervisor) {
			landingpage.goToLoginPage();
			landingpage.loginToTheApplication();
			pimPage.navigateToPIMform();
			pimPage.openCustomerProfile();
			pimPage.navigateToPersonalDetailsForm();
			pimPage.enterFirstNameInPersonalInformationForm(firstName);
			pimPage.enterMiddleNameInPersonalInformationForm(middleName);
			pimPage.enterLastNameInPersonalInformationForm(lastName);
			pimPage.enterEmployeeIDinPersonalInfoForm(employeeID);
			pimPage.enterOtherIDinPersonalInfoForm(otherID);
			pimPage.enterDriverlicenseNumberInPersonalInfoForm();
			pimPage.enterLicenseExpiryDateInPersonalInformationForm();
			pimPage.enterNationalityinPersonalInfoForm();
			pimPage.selectMaritalStatusInPersonalInfoForm();
			pimPage.enterDateOfBirthInPersonalInformationForm();
			pimPage.selectGenderInPersonalInformationForm();
			pimPage.clickSaveButton();
			pimPage.verifySuccessToasterIsDisplayed();
			pimPage.navigateToReportToPage();
			pimPage.clickAddSupervisorButton();
			pimPage.selectReportingMethod();
			pimPage.selectSupervisorName(supervisor);
			pimPage.clickSaveButtoninAddSupervisorForm();
			pimPage.verifySuccessToasterIsDisplayedInAddSupervisorForm();
		}
	
//	12. Update contact details information within the my info page along with attachments and save them.
	
	@Test(priority = 12)
	public void updateContactInformationInContactInfoPage() {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		pimPage.navigateToPIMform();
		pimPage.openCustomerProfile();
		contactInfoPage.navigateToContactDetailsForm();
		contactInfoPage.updateStreet1FieldInContactInformationForm();
		contactInfoPage.updateStreet2FieldInContactInformationForm();
		contactInfoPage.updateCityFieldInContactInformationForm();
		contactInfoPage.updateCountryInContactInformationForm();
		contactInfoPage.updateStateProvinceFieldInContactInformationForm();
		contactInfoPage.updateZIPPostalCodeFieldInContactInformationForm();
		contactInfoPage.updateWorkEmailInContactInformationForm();
		contactInfoPage.updateHomeTelephoneInContactInformationForm();
		contactInfoPage.updateMobileTelephoneInContactInformationForm();
		contactInfoPage.updateWorkTelephoneInContactInformationForm();
		contactInfoPage.updateOtherEmailInContactInformationForm();
		contactInfoPage.addAttachmentInContactInformationForm(System.getProperty("user.dir") + "\\Attachments\\David-Fincher-png.png");
		contactInfoPage.clickSaveAttachmentButton();
		contactInfoPage.verifySuccessToasterInContactInformationForm();
	}
	
	
	
	
//	13. Update Membership details information within the my info page and save them.
	
	@Test(priority = 13)
	public void updateMembershipInformationInMembershipPage() {
		landingpage.goToLoginPage();
		landingpage.loginToTheApplication();
		membershipPage.navigateToMyInfoPage();
		membershipPage.navigateToMembershipPage();
		membershipPage.ClickAddMembershipButton();
		membershipPage.selectMembershipType();
		membershipPage.selectSubscriptionPaidBy();
		membershipPage.enterSubscriptionAmount();
		membershipPage.selectSubscriptionCurrency();
		membershipPage.enterSubscriptionCommenceDate();
		membershipPage.enterSubscriptionRenewalDate();
		membershipPage.clickSaveButton();
	}


}
