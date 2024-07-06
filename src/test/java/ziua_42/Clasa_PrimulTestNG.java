package ziua_42;

/*
    1. Deschidem o aplicatie
    2. Ne logam pe aplicatie (login)
    3. Iesim din aplicatie (logout)

Pentru a putea genera o functie executabila se foloseste @Teste
*/

import drivers.DriverManager;

import org.testng.annotations.Test;
public class Clasa_PrimulTestNG {

    @Test(priority = 1)
    void openapp()
    {
        System.out.println("Deschidem aplicatia .... ");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("Ne logam la aplicatia ....");
    }

    @Test(priority = 4)
    void check1()
    {
        System.out.println("Cautam prima chestie din aplicatia ....");
    }

    @Test(priority = 3)
    void check2()
    {
        System.out.println("Cautam a doua chestie din aplicatia ....");
    }

    @Test(priority = 5)
    void logout()
    {
        System.out.println("Ne delogam din aplicatia ....");
    }

    @Test(priority = 6)
    void iesire()
    {
        System.out.println("Parasim aplicatia si pagina.");
    }
}
