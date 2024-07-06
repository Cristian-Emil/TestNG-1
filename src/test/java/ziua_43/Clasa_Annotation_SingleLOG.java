package ziua_43;

/*  ziua_43
        TC2 - avem cazul cu o singura logare si delogare si diverse cautari intermediare:

        1.  Login               --->    @BeforeClass
    2.  Multiple Search              --->    @Test
    3.  Search              --->    @Test
    4.  Advanced Search     --->    @Test
    5.  Logout              --->    @AfterClass

*/

import org.testng.annotations.*;

public class Clasa_Annotation_SingleLOG {

    @BeforeClass
    void login()
    {
        System.out.println("Ne logam pt a cauta ...");
    }

    @AfterClass
    void logout()
    {
        System.out.println("Ne delogam dupa cautare");
    }

//  Testele le specificam dupa in mod separat --------------------------------------------------------------------------

    @Test(priority=1)
    void multiple_search()
    {
        System.out.println("Cautam mai multe elemente ...");
    }

    @Test(priority=2)
    void search()
    {
        System.out.println("Cautam un anumit element ...");
    }

    @Test(priority=3)
    void advanced_search()
    {
        System.out.println("Cautare avansata a acelui element ...");
    }

//  Desi sunt scrise o singura data LOGIN si LOGOUT la inceput, ele o sa fie apelate cand porneste clasa si se inchide.
//  Testele o sa fie efectuate in ordinea prioritatilor specificate si la final, dupa ce se termina se inchide clasa.

}
