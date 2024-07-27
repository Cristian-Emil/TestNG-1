package ziua_46.Testare1;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//  Este o clasa care se extinde prin implementarea clasei LISTENER
public class Clasa_RaportulExtins implements ITestListener
{
/*
    Aceasta clasa o extindem prin alte 3 clase:
    - ExtentSparkReports
    - ExtentReports
    - ExtentTest

    Fiecare are chestia ei si metoda ei pentru raport si raspunde de ceva.
    ExtentSparkReports - are legatura cu USER INTERFACE - UI of the report
    ExtentReports - sa scrie anumite commentarii comune in raport  - populate info in report
    ExtentTest - creaza testele si innoieste metodele de testare - create test and up-date status of methods

Ca sa rulam clasele si sa avem raportul o sa accesam clasa -

 */


    public ExtentSparkReporter sparkReporter;  // UI of the report - comentat mai sus
    public ExtentReports extent;  //populate common info on the report - comentat mai sus
    public ExtentTest test; // creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context) {

        sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/ziua_46_Testare1/RaportulExtins.html");//specify location of the report

        sparkReporter.config().setDocumentTitle("Raport automat"); // Titlul raportului
        sparkReporter.config().setReportName("Test functional"); // Numele raportului
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent=new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name","localhost");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("Tester Name","Cristian Zidarescu");
        extent.setSystemInfo("OS","Windows10");
        extent.setSystemInfo("Browser name","Chrome");
    }


    public void onTestSuccess(ITestResult result) {

        test = extent.createTest(result.getName()); // creaza o noua inregistrare in raport
        test.log(Status.PASS, "Test case-ul care A TRECUT este: " + result.getName()); // update status p/f/s
    }

    public void onTestFailure(ITestResult result) {

        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test case-ul care A PICAT este: " + result.getName());
        test.log(Status.FAIL, "Test case-ul este ESUAT din cauza: " + result.getThrowable());
        // acesta face up-date la status Pass/Fails/Skip
    }

    public void onTestSkipped(ITestResult result) {

        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test case SARIT/EVITAT este: " + result.getName());
    }


    public void onFinish(ITestContext context) {

        extent.flush();
    }




}
