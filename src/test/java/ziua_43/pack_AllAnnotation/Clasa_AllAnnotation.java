package ziua_43.pack_AllAnnotation;

//  In aceasta clasa o sa prindem toate metodele  Before si After - Method, Class, Test, Suite

import org.testng.annotations.*;

public class Clasa_AllAnnotation {

    @BeforeSuite
    void bfs()
    {
        System.out.println("Aici avem BeforeSuite");
    }

    @AfterSuite
    void afs()
    {
        System.out.println("Aici avem AfterSuite");
    }

    @BeforeTest
    void bft()
    {
        System.out.println("Aici avem BeforeTeste");
    }

    @AfterTest
    void aft()
    {
        System.out.println("Aici avem AfterTest");
    }

    @BeforeClass
    void bfc()
    {
        System.out.println("Aici avem BeforeClass");
    }

    @AfterClass
    void afc()
    {
        System.out.println("Aici avem AfterClass");
    }

    @BeforeMethod
     void bfm()
    {
        System.out.println("Aici avem BeforeMethod");
    }

    @AfterMethod
    void afm()
    {
        System.out.println("Aici avem AfterMethod");
    }

    @Test(priority = 1)
    void test1()
    {
        System.out.println("Aici avem testul 1");
    }

    @Test(priority = 2)
    void test2()
    {
        System.out.println("Aici avem testul 2");
    }

    @Test(priority = 3)
    void tm1()
    {
        System.out.println("Aici avem testul 3");
    }

    @Test(priority = 4)
    void tm2()
    {
        System.out.println("Aici avem testul 4");
    }


}
