package ziua_45.Testare1;

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Clasa_Parametru extends DriverManager {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String brows, String url) throws InterruptedException
    {
//  Aici schimbam parametrii penbtru browser ca sa putem utiliza mai multe tipuri de browser

        switch(brows.toLowerCase())
        {
        case "chrome" : driver= new ChromeDriver(); break;
        case "edge" : driver= new EdgeDriver(); break;
        case "firefox" : driver= new FirefoxDriver(); break;

        default: System.out.println("Invalid browser");return;
        }

        driver=new ChromeDriver(); // acesta importa Chrome Driverul din chrome al Selenium
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");     // il comantam ca e dat de URL
        driver.get(url);
        Thread.sleep(3000);
    }

    @Test(priority=1)
    void testLogo() throws InterruptedException {
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void testTitle() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        // driver.getTitle() va returna un string/sir, deci se vor compara 2 strins/siruri.
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    void testURL() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
