package ziua_43;

/*  ziua_43
    1.  Login               --->    @BeforeMethod
    2.  Search              --->    @Test
    3.  Logout              --->    @AfterMethod
    4.  Login
    5.  Advanced search     --->    @Test
    6.  Logout

*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Clasa_Annotation_MultiLOG {

    @BeforeMethod
    void login()
    {
        System.out.println("Ne logam pt a cauta ...");
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

    @Test(priority=1)
    void multiple_search()
    {
        System.out.println("Cautam mai multe elemente ...");
    }

    @AfterMethod
    void logout()
    {
        System.out.println("Ne delogam dupa cautare");
    }

//  Desi sunt scrise o singura data LOGIN si LOGOUT, ele o sa fie apelate la fiecare @Test in parte. Cate @Test avem atatea  apelari avem
//  Testele o sa fie efectuate in ordinea prioritatilor specificate.
}
