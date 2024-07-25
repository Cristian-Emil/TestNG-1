package ziua_45.Testare1;

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;


public class Clasa_Provider extends DriverManager {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(dataProvider = "DP")
    void testLogare(String email, String pass)throws InterruptedException
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);
        boolean starea = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (starea==true)
        {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
        Thread.sleep(1500);
    }

    @AfterClass
    void pt_iesire() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.close();
    }

/*  sau putem utiliza @Test de mai jos si sa ne delogam din pagina.
    @Test(priority = 4)
    void test_delogare()
    {
        driver.quit();
    }
*/

//  Deci numele DP a fost definit la @Test si se specifica la apelarea @DataProvider

    @DataProvider(name ="DP", indices={0,2})    // pentru ca am precizat {0,2} o sa fie rulate doar acestea
//  la indices an specificat ce testele sa ruleze, daca nu se specifica nimic se vor rula toate ;
    Object[][] loginData()
    {
       Object data[][]={
                            {"cristian_teste@outlook.com","Cristian71"},
                            {"cristiantesteaza@hotmail.com","Cristian20"},
                            {"cristian_teste@outlook.com","Cristian70"},
                            {"cristiantesteaza@hotmail.com","Cristian21"},
                        };
        return data;
    }
//  o sa returneze un obiect de 2 dimensiuni cand folosim DataProvider
}
