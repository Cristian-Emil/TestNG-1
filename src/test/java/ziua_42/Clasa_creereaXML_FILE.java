package ziua_42;

//  CUM GENERAM MANUAL UN FISIER XML

public class Clasa_creereaXML_FILE {

    public static void main(String[] args) {

        System.out.println("Citeste mai jos cum se face un fisier XML in modul manual");

/*

    Pentru a genera un fisier XML in modul manual parcurgem etapele:
    1. se da click dreapta pe file-ul unde vrem sa generam fisierul xml (directorul)
    2. se creaza cu comanda new/file un fisier si se pune terminatia ".xml"
    3. in acesta se adauaga primele 2 linii:
        <?xml version = "1.0" encoding ="UTF-8"?>
        <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

    4.  in linia urmatoare se scrie :
        <suite name="fisierulMeu">
            si se inchide cu acelasi text dar cu / inaintea cuvantului suite
        </suite>
    intre cele doua SUITE se scriu restul de linii care sunt cele care indica test-ul si clasele care se ruleaza.
    Astfel o sa avem configuratia :

    <suite name="fisierulMeu">

        <test name = "testul_meu">

            <classes>
                <class name="ziua_42.Clasa_PrimulTestNG"/>
                <class name="ziua_42.Clasa_OrangeHRMTestNG"/>
            </classes>

        </test>

    </suite>

    Aceasta este configuratia prin care rulam cele 2 clase pe care le testam
        Clasa_PrimulTestNG
        Clasa_OrangeHRMTestNG

    Test suite  --->    test case   --->    test steps
    xml file    --->    classes     --->    Test methodes

    Pentru a afisa rezultatele in cadrul unui fisier trebuie sa folosim un EDITOR XML


    Cu ajutorul XML file putem sa :
    1.  executam mai multe test case-uri ca o singura suita
    2.  se poate genera testng reports (default)


*/

    }
}
