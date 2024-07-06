package ziua_44;
/*
    In clasa GRUPURI o sa consideram mai multe clase care au mai multi parametrii

    class1 - p1, p2, p3, p4
    class2 - p5, p6 ,p7, p8
    class3 - p9, p10 ,p11

----
    si avem testarea care se face pe aceste clase, individual si pentru fiecare parametru existent
    sanity testing
    regression testing
    functional testing

----

    acum le consideram ca fiind
    logare_email1       - sanity test
    logare_email2       - sanity test
    logare_pinterest    - sanity test
    logare_instagram    - sanity test

    delogare_email1     - regression test
    delogare_email2     - regression test
    delogare_pinterest  - regression test
    delogare_instagram  - regression test

    plata_lei           - sanity, regression (functional test)
    plata_euro          - sanity, regression (functional test)
    plata_dolari        - sanity, regression (functional testr)

*/

import org.testng.annotations.Test;

public class Clasa_Grupuri {

    @Test
    void print()
    {
        System.out.println("Vezi si ruleaza fisierul grupuri.xml");
        System.out.println("Cauta Clasa Test de Logare");
        System.out.println("Cauta Clasa Test de Testare");
        System.out.println("Cauta Clasa Test de Delogare");
    }

}
