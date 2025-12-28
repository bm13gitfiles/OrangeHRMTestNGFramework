package demo.orangehrm.framework.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import demo.orangehrm.framework.base.BasePage;
import demo.orangehrm.framework.reports.Reports;
import demo.orangehrm.framework.web.commons.WebCommons;

public class TestNGListeners extends Reports implements ITestListener, ISuiteListener {
	
	//This class implements TestNG listeners to handle test events and suite events for reporting purposes

    @Override
    public void onStart(ISuite suite) {
        new Reports().setupReport(); // This ensures the report is initialized
    }

    @Override
    public void onFinish(ISuite suite) {
        Reports.stopReporting(); // Flushes the report at the end
    }

    @Override
    public void onTestStart(ITestResult result) {
        startReporting(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (logger != null) {
            logger.pass(result.getMethod().getMethodName() + " passed successfully");
        }
        stopReporting();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (logger != null) {
            logger.fail(result.getMethod().getMethodName() + " failed");
            try {
                logger.addScreenCaptureFromPath(WebCommons.takeScreenshot(BasePage.getDriver(), result.getMethod().getMethodName()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        stopReporting();
    }
}
