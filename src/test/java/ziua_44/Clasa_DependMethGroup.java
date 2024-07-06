package ziua_44;
/*
openapp
login
search
advsearch
logout

    In acest caz "openapp" este un test iar "login" este un alt test
    Fiecare poate sa fie FAIL dar fiecare ruleaza ceva diferit.

    Avem functia de dependinta de unul sau mai multi parametrii si se utlizeaza

    dependsOnMethods ={"parameter1", "paramater 2", "paramater 3", ........}:

 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class Clasa_DependMethGroup {


//  Varianta 1
    @Test(priority=1)
    void openapp1()
    {
        Assert.assertTrue(false);
    }

//  Dupa ce am vazut ca ruleaza desi primul test a picat o sa punem conditie care interconecteaza testele intre ele
    @Test(priority=2)
    void login1()
    {
        Assert.assertTrue(true);
    }

    @Test(priority=3)
    void search1()
    {
        Assert.assertTrue(true);
    }

    @Test(priority=4)
    void adv_search1()
    {
        Assert.assertTrue(true);
    }

    @Test(priority=5)
    void logout1()
    {
        Assert.assertTrue(true);
    }


//----------------------------------------------------------------------------------------------------------------------
//  Varianta 2

    @Test(priority=6)
    void openapp2()
    {
        Assert.assertTrue(true);
    }

//  Dupa ce am vazut mai sus ca ruleaza asa o sa punem conditia de DEPENDENCI
    @Test(priority=7, dependsOnMethods = {"openapp2"})
    void login2()
    {
        Assert.assertTrue(true);
    }

    @Test(priority=8, dependsOnMethods = {"login2"})
    void search2()
    {
        Assert.assertTrue(false);
    }

    @Test(priority=9, dependsOnMethods = {"login2","search2"})
    void adv_search2()
    {
        Assert.assertTrue(true);
    }

    @Test(priority=10, dependsOnMethods = {"login2","search2","adv_search2"})
    void logout2()
    {
        Assert.assertTrue(true);
    }

/*
    Se abserva ca testele care depind de conditia anterioara o sa fie sarite din cauza DEPENDENCI_METHOD.
    Se poate considera o singura dependinta , de un paramatru sau multipla de mai multi parametrii.
    Parametrul poate sa fie setat oricare din conditile anterioare
 */
}
