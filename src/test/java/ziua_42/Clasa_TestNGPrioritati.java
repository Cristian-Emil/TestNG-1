package ziua_42;

import org.testng.annotations.Test;

public class Clasa_TestNGPrioritati {

//  AM SCHIMBATY ORDINEA TESTELOR DAR AM INDICAT CLAR PRIORITATEA LOR  - SE POATE RULA FARA PROBLEME PT CA FUNCTIE DE PRIORITATE

    @Test(priority = 2)
    void login()
    {
        System.out.println("Ne logam la aplicatia ....");
    }

    @Test(priority = 4)
    void check2()
    {
        System.out.println("Cautam a doua chestie din aplicatia ....");
    }

    @Test(priority = 5)
    void logout()
    {
        System.out.println("Ne delogam din aplicatia ....");
    }

    @Test(priority = 1)
    void openapp()
    {
        System.out.println("Deschidem aplicatia .... ");
    }

    @Test(priority = 6)
    void iesire()
    {
        System.out.println("Parasim aplicatia si pagina.");
    }

    @Test(priority = 3)
    void check1()
    {
        System.out.println("Cautam prima chestie din aplicatia ....");
    }

    void check7()
    {
        System.out.println("Acesta este un test neapelat din aplicatia ....");
    }

/*
    ATENTIE:
        Daca nu este specificata prioritatea, aceasta o sa fie luata prima pt ca are index ZERO.
        In cazul in care aceeasi priritate o sa se in ordine alfabetica
        Putem sa avem prioritate negativa si se va incepe de la cea mai mica

        Pentru comanda din linia 47, pt ca nu avem @Test inserat o sa-l vada dar n-o sa-l execute pt ca nu este APELAT.
 */



}
