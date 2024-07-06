package ziua_43.pack_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Clasa_SoftAssertion {

    SoftAssert Soft_Assert = new SoftAssert();

    @Test
    void test1()
    {
        String a = "xyz";
        String b = "abc";
        String c = "xyz";


//  Initializam clasa SoftAssert

//        SoftAssert Soft_Assert = new SoftAssert();

        Soft_Assert.assertEquals(a, b);
        Soft_Assert.assertEquals(a, c);
        System.out.println("Test1 a fost efectuata si avem rezultatele: \n");

        Soft_Assert.assertAll();  // Raporteaza toate aserțiile , inclusiv cele esuate
    }

    @Test
    void test2()
    {
        int a1 = 9;
        int b1 = 7;

//        SoftAssert Soft_Assert = new SoftAssert();

        Soft_Assert.assertEquals(a1, b1);
        System.out.println("Test2 a fost efectuata si avem rezultatele: \n");

        Soft_Assert.assertAll();
    }


}
