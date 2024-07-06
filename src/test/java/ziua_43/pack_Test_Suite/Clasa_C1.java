package ziua_43.pack_Test_Suite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clasa_C1 {

    @Test
    void abc()
    {
        System.out.println("Acestea sunt abd din clasa C1");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("Acestea sunt din BeforeTest Method");
    }

}
