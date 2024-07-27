package ziua_46.Testare1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Clasa_Listener implements ITestListener
{

//  ca sa implementam o clasa din ITestListener punem cursorul pe acesta , apasam CTRL si dam click.
//  Se deschide o clasa de unde copiem ce avem nevoie
//  Schimbam in loc de DEFAULT in PUBLIC

    public void onStart(ITestContext context) {
        System.out.println("Este testul care porneste / declanseaza ...  ");
    }


    public void onTestStart(ITestResult result) {
        System.out.println("Testul porneste ...  ");
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("Testul a trecut ...  ");
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("Testul a picat ...  ");
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("Testul a sarit ...  ");
    }


    public void onFinish(ITestContext context) {
        System.out.println("Testul a fost finalizat ...  ");
    }


}
