package utilities;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener
{
    private ExtentSparkReporter sparkReporter;
    private ExtentReports extent;
    private ExtentTest test;

    @Override
    public void onStart(ITestContext testContext)
    {
        sparkReporter = new ExtentSparkReporter(
                System.getProperty("user.dir") + "/Reports/myReport.html"
        );

        sparkReporter.config().setDocumentTitle("API Automation Report");
        sparkReporter.config().setReportName("GoREST API Automation");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Host Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Piyush");
    }

    @Override
    public void onTestStart(ITestResult result)
    {
        test = extent.createTest(result.getName());

        test.log(
                Status.INFO,
                "Test Started: " + result.getName()
        );
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        test.log(
                Status.PASS,
                "Test Case PASSED: " + result.getName()
        );
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        test.log(
                Status.FAIL,
                "Test Case FAILED: " + result.getName()
        );

        test.log(
                Status.FAIL,
                "Failure Reason: " + result.getThrowable()
        );
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        test.log(
                Status.SKIP,
                "Test Case SKIPPED: " + result.getName()
        );
    }

    @Override
    public void onFinish(ITestContext testContext)
    {
        extent.flush();
    }
}
