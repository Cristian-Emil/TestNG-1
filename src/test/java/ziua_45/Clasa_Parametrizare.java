package ziua_45;
import drivers.DriverManager;

/*
    O sa folosim parametrizarea folosind

1)  @DataPROVIDER - data driven testing
2)  using xml file - paralle testing

teste executate in paralele cu ajutorul fisierului XML
------------------------------------------------------
pasul 1 - se genereaza test case-urile
pasul 2 - se genereaza fisierul XML si apoi se ruleaza test case-urile prin intermediul fisierului XML
pasul 3 - se scrie numele browser-ului, URL-ul conform parametrilor din fisierul xml pentru metoda setup()
pasul 4 - se executa testele in chrome & edge & firefox (executie in serie sau executie secventiala )
pasul 5 - se executa testele in chrome & edge & firefox (executie in paralele) prin specificarea URL-ului la - driver.get("url");

pentru a face pasul 5 folosim liniile de comanda pt fiecare parametru:
                <parameter name="url"  value="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"/>

*/

public class Clasa_Parametrizare extends DriverManager {

    public static void main(String[] args) {
        System.out.println("Aceasta e pt parametrizare si rularea mai multor teste si clase in acelasi timp - vezi TESTARE1");

        System.out.println("Pentru executia testelor in chrome & edge & firefox - executie in serie - se parcurg pasii de mai sus" );
    }


}
