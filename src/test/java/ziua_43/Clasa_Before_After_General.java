package ziua_43;

/*
    In ziua 43 studiem in continuare @Test  dar cu proprietatile :
    @BeforeMethod
    @AfterMethod

    @BeforeClass
    @AfterClass

    @BeforeTest
    @AfterTest

    @BeforeSuite
    @AfterSuite
 */
/*
    TC1 - avem cazul cu mai multe logari si delogari consecutive cu diverse cautari intermediare:

    1.  Login               --->    @BeforeMethod
    2.  Search              --->    @Test
    3.  Logout              --->    @AfterMethod
    4.  Login
    5.  Advanced search     --->    @Test
    6.  Logout
    7.  Login
    8.  Multiple search     --->    @Test
    9.  Logout

    Se poate implementa un login si un logout care sa fie apelate/repetate de cate ori este nevoie
*/
/*
    TC2 - avem cazul cu o singura logare si delogare si diverse cautari intermediare:

    1.  Login               --->    @BeforeClass
    2.  Multiple Search              --->    @Test
    3.  Search              --->    @Test
    4.  Advanced Search     --->    @Test
    5.  Logout              --->    @AfterClass

*/

/*
    TC3 - avem cazul cu mai multe teste de verificat - vezi in fisierul XML unde avem 3 teste separate.:
    Forma fisierul XML este :

    <suite name="suita mea de teste">

        <test name="numele testului meu">
            <classes>
                <class name="prima cautare">
                <class name="a doua cautare">
            </classes>
        </test>

    </suite>

    Mai sus avem un singur test pt ca ambele class sunt sub acelasi TEST
    Mai jos avem doua test pt ca cle 2 class sunt in TEST diferite

    <suite name="suita mea de teste">

        <test name="testul meu 1">
            <classes>
                <class name="prima cautare">
            </classes>
        </test>

        <test name="testului meu 2">
            <classes>
                <class name="cautare multipla">
            </classes>
        </test>

    </suite>


    1.  Login               --->    @Before
    2.  Multiple Search              --->    @Test
    3.  Search              --->    @Test
    4.  Advanced Search     --->    @Test
    5.  Logout              --->    @After

*/

public class Clasa_Before_After_General {

    public static void main(String[] args) {
        System.out.println("Aici vedem cum se pot utiliza functionalitatile  BEFORE & AFTER ");

    }
}
