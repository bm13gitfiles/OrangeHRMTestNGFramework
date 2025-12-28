package demo.orangehrm.framework.application.steps;

import org.openqa.selenium.WebDriver;

import demo.orangehrm.framework.application.elements.HomepageElements;

public class HomepageSteps extends HomepageElements {

	public HomepageSteps(WebDriver driver) {
		super(driver);
	}
	
	public void navigateToAdminPage() {
		mouseClick(adminSideBar);
		implicitWait();
		waitForTheElementToBeVisible(AdminPageTitle);
		threadWait(1000);
	}
	
	public void launchAdminPageURL() {
		launchPagebyURL("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	}
	

	public void verifySearchBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(searchTypeSideBar);
		log("INFO", "Searchbar Displayed in Sidepanel");
	}

	public void verifyAdminSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(adminSideBar);
		log("INFO", "Admin Sidebar displayed in Sidepanel");
	}

	public void verifyPimSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(pimSideBar);
		log("INFO", "PIM displayed in Sidepanel");
	}

	public void verifyLeaveSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(leaveSideBar);
		log("INFO", "Leave displayed in Sidepanel");
	}

	public void verifyTimeSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(timeSideBar);
		log("INFO", "Time displayed in Sidepanel");
	}

	public void verifyRecruitmentSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(recruitmentSideBar);
	}

	public void verifyMyInfoSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(myInfoSideBar);
		log("INFO", "My Info displayed in Sidepanel");
	}

	public void verifyPerformanceSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(performanceSideBar);
		log("INFO", "Performance displayed in Sidepanel");
	}

	public void verifyDashboardSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(dashboardSideBar);
		log("INFO", "Dashboard displayed in Sidepanel");
	}

	public void verifyDirectorySideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(directorySideBar);
		log("INFO", "Directory displayed in Sidepanel");
	}

	public void verifyMaintenanceSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(maintenanceSideBar);
		log("INFO", "Maintenance displayed in Sidepanel");
	}

	public void verifyClaimSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(claimSideBar);
		log("INFO", "Claim displayed in Sidepanel");
	}

	public void verifyBuzzSideBarDisplayedInSidePanel() {
		waitForTheElementToBeVisible(buzzSideBar);
		log("INFO", "Buzz displayed in Sidepanel");
	}
	
	
	
	
	

}
