package ziua_43.pack_BF_AF_Test;

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

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Clasa_AfterTest {

        @Test
        void xyz()
        {
            System.out.println("Aceasta e clasa 'xyz' din AfterTest");
        }

        @AfterTest
        void af_tst()
        {
            System.out.println("Aici avem metoda AfterTest");
        }


    }
