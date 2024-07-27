package ziua_47_PagObjMod;

public class Clasa_PageObjectModel {

    public static void main(String[] args) {
        System.out.println("Ce este un Page Object Model");
        System.out.println("Page object model nu este un framework, este un design pattern - un model de format pt o metoda");

/*
    Page object model contine:
    locators        - locatori
    test methods    - metode de testare , care contin COD , VALIDATORI si ACTIUNE

    Avem 2 metode de a crea Page Object Class
    1)  fara sa utilizam PageFactory
    2)  cu utilizare PageFactory

--------------------------------------------------------

 Pentru gasirea unui element folosim WebElement si findElement :
    WebElement textUtilizat = driver.findElement(By.xpath('//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input'));

    In acest caz o sa stocam locatorul : //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
    intr-o variabila si localizam elementul:

    locator = '//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input'

------------------------------------------------------

    Daca nu ne place sintaxa cu xpath putem sa folosim:

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")  WebElement user_loc2;

    atunci putem sa folosim modelul:
    @FindBy(how = HOW.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input" ) WebElement user_loc2;
*/

    }

}
