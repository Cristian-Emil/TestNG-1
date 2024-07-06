/*
    Aceasta clasa o s-o folosim ca sa facem conversia to XML FILE
    Pentru a converti o clasa Java in XML cand folosim INTELLIJIDEAo sa utilizam o dependita din POM.XML prin adaugarea lkiniilor:

    <dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.1</version>
    </dependency>
    <dependency>
        <groupId>com.sun.xml.bind</groupId>
        <artifactId>jaxb-core</artifactId>
        <version>2.3.0.1</version>
    </dependency>
    <dependency>
        <groupId>com.sun.xml.bind</groupId>
        <artifactId>jaxb-impl</artifactId>
        <version>2.3.2</version>
    </dependency>

    Dupa aceasta o sa punem @XmlRootElement in clasa pe care dorim s-o convertim
 */

/*
    Fisierul XML se poate genera:
    - automat
    - manual

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.Duration;

//  @XmlRootElement
public class Orange_JavaToXML {

    WebDriver driver;

    @Test(priority=1)
    void openapp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority=2)
    void testLogo() throws InterruptedException
    {
        Thread.sleep(3000);
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("logo displayed..."+status);
    }

    @Test(priority=3)
    void testLogin()
    {

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority=4)
    void closeApp()
    {
        driver.quit();
    }

}
