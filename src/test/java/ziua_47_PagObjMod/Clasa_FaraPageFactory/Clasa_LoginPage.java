package ziua_47_PagObjMod.Clasa_FaraPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//  ACEASTA ESTE --  PAGE OBJECT CLASS -- cea in care precizam toate elementele pt a definii apelarea.

public class Clasa_LoginPage {

//  Avem urmatoarele elemente de care avem nevoie:
    WebDriver driver;

//  Constructor - cel prin care initializam si apelam driver-ul si va avea numele clasei

    Clasa_LoginPage(WebDriver driver)
    {
        this.driver = driver;   // asa initializam driver-ul
    }

//  Locator - este cel prn care selectam locatorul

/*
    Forma generala este
    WebElement textUtilizat = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

    Dar acum o sa comentam linia de WebElement pt ca e precizat de ce am facut asta in Clasa_PageObjectModel si folosim alta metoda
    Generam LOCATOR pentru fiecare din cele pe care urmeazxa sa le utilizam
*/

    By user_loc = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    By pass_loc = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    By login_loc = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");


//  Metodele de actiune

    public void settUser(String user)
    {
        driver.findElement(user_loc).sendKeys(user);
    }

    public void settPass(String pss)
    {
        driver.findElement(pass_loc).sendKeys(pss);
    }

    public void clickLogin()
    {
        driver.findElement(login_loc).click();
    }

/*  O varianta pentru sintaxele folosite este cea de mai jos:

    Daca dorim sa nu folosim direct XPATH :
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")  WebElement user_loc2;

    atunci putem sa folosim modelul cu HOW.XPATH:
    @FindBy(how = HOW.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input" ) WebElement user_loc2;
*/


}
