package ziua_44;

import org.testng.annotations.Test;

public class Clasa_PlataInValute {

    @Test(priority=1, groups={"sanity","regression","functional"})
    void plata_lei()
    {
        System.out.println("Plata in RON");
    }

    @Test(priority=2, groups={"sanity","regression","functional"})
    void plata_euro()
    {
        System.out.println("Plata in EURO");
    }

    @Test(priority=3, groups={"sanity","regression","functional"})
    void plata_dolari()
    {
        System.out.println("Plata in Dolari");
    }

}
