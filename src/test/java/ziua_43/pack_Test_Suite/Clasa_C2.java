package ziua_43.pack_Test_Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Clasa_C2 {

    @Test
    void xyz()
    {
        System.out.println("Acestea sunt xyz din clasa C2");
    }

    @AfterTest
    void bt()
    {
        System.out.println("Acestea sunt din AfterTest Method");
    }

}
