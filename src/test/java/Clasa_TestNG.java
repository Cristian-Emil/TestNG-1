
public class Clasa_TestNG {

/*
    TestNG este un JAVA BASED UNIT TESTING TOOLS - deci TestNG este o unealta, un framework care ne ajuta sa realizam
    mai multe teste in acelasi timp, cu mai multe browsere si mai multe URL-uri.
    TestNG ne ajuta sa folosim mai multe caracteristici - FEATURES - ale Java.
    Deci putem sa gestionam (managerizam) mai multe elemente in acelasi timp, cum sunt:
    - Test case & test suites (cazuri de testare si suite ale acestora)
    - Grouping of test case (grupuri de teste care pot msa fie separate sau la comun)
    - Prioritize (sa fie prioritizate)
    - Paramatrization (se pot parametriza)
    - Parallel testing (realizarea de teste in paralele)
    - Reports (multiple rapoarte)
*/

/*
    TestNG Configuration - method 1 (pentru IntelliJ IDEA)
    - acesta se face prin adaugarea de linii cu elemente in cadrul fisierului POM.XML
    "
            <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.7.1</version>
            <scope>test</scope>
        </dependency>
    "
    Aceste linii se copiaza din URL-ul :
    "https://mvnrepository.com/"
    unde se insereaza TestNG in bara de Search.
    "https://mvnrepository.com/search?q=TestNG"
    De unde se alege varianta cea mai stabila - adica cea care are cele mai multe utilizari.
    Astazi 06.06.2024 avem varianta :
    "https://mvnrepository.com/artifact/org.testng/testng/7.10.1'
    care are peste 117 utilizari , deci este suficient de stabila ca sa fie utilizata.
    Dupa ce sunt adaugate se ruleaza MAVEN-ul din partea dreapta a ecranului pentru a face up-date la dependinte.


    TestNG Configuration - method 2 (valabil pentru ECLIPSE IDE)
    Se merge in cadrul proiectului - in titlu, se cauta HELP MENUE de unde se selecteaza :   Eclipse MarketPlace
    Se selecteaza si apare o ferestra unde scrie "TestNG for Eclipse". Se da click pe Install si se instaleaza programul.
    Se lecteaza toate elementele din noua ferestra si se da click pe "Accept the Risk"
    Apare o fereastra cu "Restart Eclips" si se da click pe ea.

    Cum am precizat in titlu, pentru IntelliJ IDEA se foloseste metoda 1 care este mult mai simpla si sigura.
*/

/*
    PENTRU RULAREA TESTELOR se foloseste comanda @Test
    TestNG le executa in ordine alfabetica . Daca dorim alta ordine folosim metoda de prioritizare - de mai jos.
    - daca dorim sa le prioritizam sau sa schimbam ordinea, putem sa precizam ordinea in care acestea trebuie executate
    @Test(priority = 1)
    @Test(priority = 3)
    @Test(priority = 2)
    ...
    ...
    @Test(priority = n)

    Aici am ales ca testul 3 sa fie rulat inaintea testului 2 ( linia 3 ruleaza inainte de linia 2)

 */

/*
    Rularea mai multor teste in acelasi timp:
    Folosim un fisier XML - xml file => execute test cases using testNG xml file

 */

/*
    Assertion  - validation point
    Se face prin compararea elementelor cautate si gasite.

    Avem variantele :
    HardAssert - care opreste testul la prima eroare gasita
    SoftAssert - care ruleaza toate testele si la final se specifica si ne transmite erorile gasite.

    Pentru Soft Assert se face instantiere cu comanda
    SoftAssert softAssert = new SoftAssert();   // acaeasta este instantiere pt SoftAssert.
    softAssert.assertTrue()

    Instantiere se poate face atat in afara lui @Test cat si in interiorul acesteia, in functie de cum avem nevoie
    Vezi modelul din Clasa_SoftAssertion din pachetul pack_Assertion din ziua_43

 */



}
