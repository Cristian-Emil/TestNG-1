package ziua_43.pack_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Clasa_Assertion {

    @Test
    void testTitlu()
    {
        String expect_titlu = "Opencart";
//        String actual_titlu = "Openshop";     // daca decomentam linia asta o sa avem FAIL
        String actual_titlu = "Opencart";       //  daca decomentam linia aceasta o sa avem PASSED

        System.out.println("Varianta 1 - IF-ELSE");
        if (expect_titlu.equals(actual_titlu))
        {
            System.out.println("Test PASSED");
        }
        else
        {
            System.out.println("Test FAIL");
        }

//  Pentru a nu mai face chestia de mai sus folosim clasa ASSERTION
//  Variante 1
        Assert.assertEquals(actual_titlu, expect_titlu);

//  Variante 2 - in care avem si afisarea valorii utilizand varianta TRY-CATCH
        System.out.println("Varianta 2 - Assert");
        try
        {
            Assert.assertEquals(expect_titlu, actual_titlu);
            System.out.println("Testul este PASSED");
        } catch(AssertionError e)
        {
            System.out.println("Testul este FAIL");
        }

//  Sau folosim o cale combinata unde avem IF dar si ASSERTION
//  Varianta 3
        System.out.println("Varianta 3 - IF-ELSE + Assert");
        if (expect_titlu.equals(actual_titlu))
        {
            System.out.println("Test Pass");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("Test Fail");
            Assert.assertTrue(false);
        }


    }





}
