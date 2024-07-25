package ziua_46.Testare1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Clasa_OrangeHRM {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority=1)
    void testlogoul(){
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);
    }

    @Test(priority = 2)
    void testApportURL(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority=3, dependsOnMethods = {"testApportURL"})
    void testPaginaDeTitlu(){
        Assert.assertEquals(driver.getCurrentUrl(), "OrangeHRM");
    }

    @AfterClass
    void TearDown(){
        driver.quit();
    }


//  Daca rulam doar aceasta clasa singura o sa avem un test PASS, unul FAIL si unul SKIP
}
