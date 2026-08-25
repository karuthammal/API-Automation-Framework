package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir")
                + "/test-output/ExtentReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("API Automation Test Report");
        reporter.config().setDocumentTitle("API Test Results");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Karuthammal");
        extent.setSystemInfo("Project", "API Automation");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }
}
   