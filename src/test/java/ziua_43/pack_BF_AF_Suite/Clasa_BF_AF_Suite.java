package ziua_43.pack_BF_AF_Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Clasa_BF_AF_Suite {

    @Test
    void x123()
    {
        System.out.println("Aceasta e clasa 'x123' din BeforeSuite");
    }

    @Test
    void y456()
    {
        System.out.println("Aceasta e clasa 'y456' din AfterSuite");
    }

    @BeforeSuite
    void bfs()
    {
        System.out.println("Aici avem metoda BeforeSuite");
    }

    @AfterSuite
    void afs()
    {
        System.out.println("Aici avem metoda AfterSuite");
    }

}
