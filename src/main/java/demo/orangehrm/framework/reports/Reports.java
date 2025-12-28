package demo.orangehrm.framework.reports;

import java.util.logging.Logger;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
	
	// This class sets up and manages ExtentReports for test reporting

    public static final Logger log = Logger.getLogger(Reports.class.getName());

    public static ExtentSparkReporter html; // White paper
    public static ExtentReports extent;     // Printer
    public static ExtentTest logger;        // Ink
    
    // Initialize ExtentReports before the test suite starts
    
    @BeforeSuite(alwaysRun = true)
    public void setupReport() {
        try {
            String reportPath = System.getProperty("user.dir") + "\\Reports\\ExtentReport.html";
            html = new ExtentSparkReporter(reportPath);
            html.config().setReportName("Web Automation Results");
    		html.config().setDocumentTitle("E2E Test Results");
    		html.config().setTheme(Theme.DARK);
            extent = new ExtentReports();
            extent.attachReporter(html);
            extent.setSystemInfo("Tester", "Balu Mahendran M");
    		extent.setSystemInfo("Role", "Senior QA");
            
            log.info("Extent report initialized at: " + reportPath);
        } catch (Exception e) {
            log.severe("Failed to initialize Extent report: " + e.getMessage());
        }
    }
    
    // Start reporting for a specific test case

    public static void startReporting(String testName) {
        if (extent == null) {
            log.severe("ExtentReports is not initialized. Cannot start test: " + testName);
            return;
        }
        logger = extent.createTest(testName);
        log.info("Started reporting for test: " + testName);
    }
	
    
    // Stop reporting and flush the report to the file
    public static void stopReporting() {
        if (extent != null) {
            extent.flush();
            log.info("Extent report flushed successfully.");
        } else {
            log.warning("ExtentReports is null. Cannot flush report.");
        }
    }

    public static boolean isLoggerReady() {
        return logger != null;
    }


    public static void log(String status, String message) {
        if (logger == null) {
            log.warning("Logger is not initialized. Skipping Extent logging for: " + message);
            return;
        }

        switch (status.toLowerCase()) {
            case "pass":
                logger.pass("INFO: " + message);
                break;
            case "fail":
                logger.fail("FAIL: " + message);
                throw new AssertionError("FAIL: " + message); // Avoid NullPointerException
            case "info":
                logger.info("INFO: " + message);
                break;
            case "warning":
                logger.warning("WARNING: " + message);
                break;
            default:
                logger.info("UNKNOWN STATUS: " + message);
                break;
        }
    }
}
