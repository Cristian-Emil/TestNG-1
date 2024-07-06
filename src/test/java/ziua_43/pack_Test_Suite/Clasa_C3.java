package ziua_43.pack_Test_Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Clasa_C3 {
    @Test
    void pqr()
    {
        System.out.println("Acestea sunt pqr din clasa C3");
    }

    @BeforeSuite
    void bs()
    {
        System.out.println("Acestea sunt din BeforeSuit Method");
    }

    @AfterSuite
    void at()
    {
        System.out.println("Acestea sunt din AfterSuit Method");
    }

}
