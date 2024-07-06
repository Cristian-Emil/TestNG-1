package ziua_42;

/*
    Pentru a rula o aplicatie urmarim pasii:
    1. Deschidem o aplicatie
    2. Ne logam pe aplicatie (login)
    3. Iesim din aplicatie (logout)

Pentru a putea genera o functie executabila se foloseste @Teste
*/

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Clasa_OrangeHRMTestNG extends DriverManager {
    WebDriver driver = new ChromeDriver();  // definim un driver in afara testeleor astfel incat e l sa fie apelat de fiecare data

    @Test(priority = 1)
    void deschidereApp() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((10)));  // se poate comenta ca e definit in DriverManager
        driver.manage().window().maximize();
        Thread.sleep(2500);
    }

    @Test(priority = 2)
    void testLogo() throws InterruptedException {
        boolean Logo1 = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo-ul este afisat ..." + Logo1);
        Thread.sleep(2500);
    }

    @Test(priority = 3)
    void testlogare() throws InterruptedException {
//	Accesam userul si parola pe care le inseram
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

//	Apasam butonul de LOGIN. Avem 2 variante si pe prima o comentam.
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        WebElement button_Login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        button_Login.click();
        Thread.sleep(5000);
    }

//  Iesim din browser
    @Test(priority = 4)
    void testlogout()
    {
        driver.quit();
    }


}
