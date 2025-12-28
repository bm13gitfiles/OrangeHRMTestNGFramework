package demo.orangehrm.framework.application.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import demo.orangehrm.framework.application.steps.AdminPageSteps;
import demo.orangehrm.framework.application.steps.ContactInformationPageSteps;
import demo.orangehrm.framework.application.steps.ForgotPasswordSteps;
import demo.orangehrm.framework.application.steps.HomepageSteps;
import demo.orangehrm.framework.application.steps.LandingPageSteps;
import demo.orangehrm.framework.application.steps.MembershipPageSteps;
import demo.orangehrm.framework.application.steps.PIMpageSteps;
import demo.orangehrm.framework.base.BasePage;
import demo.orangehrm.framework.file.utilities.ExcelUtil;

public class BaseTests extends BasePage {
	
	public LandingPageSteps landingpage;
	public ForgotPasswordSteps forgotPasswordSteps;
	public AdminPageSteps adminPage;
	public HomepageSteps homePage;
	public PIMpageSteps pimPage;
	public ContactInformationPageSteps contactInfoPage;
	public MembershipPageSteps membershipPage;
	
	
	@BeforeMethod(alwaysRun = true)
	public void initializePageClasses() {
		WebDriver driver = BasePage.getDriver();		
		landingpage = new LandingPageSteps(driver);
		forgotPasswordSteps = new ForgotPasswordSteps(driver);
		homePage = new HomepageSteps(driver);
		adminPage = new AdminPageSteps(driver);
		pimPage = new PIMpageSteps(driver);
		contactInfoPage = new ContactInformationPageSteps(driver);
		membershipPage = new MembershipPageSteps(driver);
	}
	
	
	@DataProvider(name = "TestDataProvider")
    public Object[][] getTestData(Method method) {
		
		Object[][]data = ExcelUtil.readExceldata("TestData.xlsx",method.getName());
		
        return data;
    }
	
	
	

}