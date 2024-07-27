package ziua_47_PagObjMod.Clasa_CuPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//  ACEASTA ESTE --  PAGE OBJECT CLASS -- cea in care precizam toate elementele pt a definii apelarea.

public class Clasa_LoginPage2 {

//  Avem urmatoarele elemente de care avem nevoie:
    WebDriver driver;

//  Constructor - cel prin care initializam si apelam driver-ul si va avea numele clasei

    Clasa_LoginPage2(WebDriver driver)
    {
        this.driver = driver;   // asa initializam driver-ul
        PageFactory.initElements(driver, this);
    }

//  Locator - este cel prn care selectam locatorul

/*
    Forma generala este
    WebElement textUtilizat = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

    Aici o sa folosim sintaxa @FindBy() si s-o stocam in cadrul unei variabile.
    Dupa apelam direct variabila urmata de actiune.
*/



    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")  WebElement user_loc2;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")  WebElement pass_loc2;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")  WebElement login_loc2;


//  Metodele de actiune , pt ca avem deja WebEleement o sa scrie direct variabila urmata de actiune.

    public void settUser(String user)
    {
        user_loc2.sendKeys(user);
    }

    public void settPass(String pss)
    {
        user_loc2.sendKeys(pss);
    }

    public void clickLogin()
    {
        login_loc2.click();
    }

/*
    Daca utilizam SELECTORHUB putem sa facem setarea in acesta sa ne trimita xpath sau cssSeelctro de o anumita forma,
    stocam valoarea in cadrul unei variabile si apoi accesam link-ul

    @FindBy(tagName="variabila")
    List<WebElement> links;

    Asa putem localiza un grup de elemente, locatori

-----------------------------

    PageFactory.initElements(driver, this); - ce este acest PageFactory
    PageFactory este o clasa predefinita in cadrul pachetului Selenium si prin intermediul ei apela initElements. Ea este
    aplicabila pentru toate tipurile de elemente.
    initElement este cel care initializeaza toate elementele conditionate de driver.

    Daca dorim sa nu folosim sintaxa:
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")  WebElement user_loc2;

    atunci putem sa folosim modelul cu HOW.XPATH:
    @FindBy(how = HOW.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input" ) WebElement user_loc2;

 */

}
