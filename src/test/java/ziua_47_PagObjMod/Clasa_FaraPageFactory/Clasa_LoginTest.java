package ziua_47_PagObjMod.Clasa_FaraPageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;       // acesta este de la Soft Assert

import java.time.Duration;


//  ACEASTA O SA FIE  --  TEST CASE CLASS -- cea in care o sa precizam si definim ce teste dorim sa facem.

public class Clasa_LoginTest {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void testLogin()
    {
//  Aici apelam actiunile din Clasa_LoginPage. O sa generam un obiect care sa apeleze aceste elemente
        Clasa_LoginPage C_LP = new Clasa_LoginPage(driver);

//  Acum facem actiuneaa, deci accesam C_LP si inseram valorile :
        C_LP.settUser("Admin");
        C_LP.settPass("admin123");
        C_LP.clickLogin();

//  Folosim un SoftAssert astfel incat testul sa ruleze pana la final indiferent de ce se intampla - valid sau picat.
//  Pentru ca am definit un softAssert o sa comentam linia de Assert simplu si o folsoim pe cea cu Soft

        SoftAssert softAssert = new SoftAssert();

//        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        softAssert.assertEquals(driver.getTitle(), "OrangeHRM");

    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
