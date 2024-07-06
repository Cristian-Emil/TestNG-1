package ziua_43.pack_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Clasa_HardAssertion {

    @Test
    void test()
    {
        String a = "xyz";
        String b = "abc";
        String c = "xyz";
        int a1 = 9;
        int b1 = 7;
//        Assert.assertEquals(a, b);
        Assert.assertEquals(a, c);
        System.out.println("Testarea a fost : PASS\n");
        Assert.assertEquals(a1, b1);
        System.out.println("Testarea a fost : \n");

    }

/*
    Daca decomentam primul rand o sa avem FAIL si testul se opreste la acel pas.
    Ca sa treaca mai departe si sa fac si restul de teste trebuie sa folosim SOFTASSERT
 */
}
