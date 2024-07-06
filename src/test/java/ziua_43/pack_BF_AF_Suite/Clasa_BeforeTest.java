package ziua_43.pack_BF_AF_Suite;

/*  ziua_43
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

*/

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clasa_BeforeTest {

    @Test
    void abc()
    {
        System.out.println("Aceasta e clasa 'abc' din BeforeTest");
    }

    @BeforeTest
    void bf_tst()
    {
        System.out.println("Aici avem metoda BeforeTest");
    }



}
